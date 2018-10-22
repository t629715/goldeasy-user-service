package com.goldeasy.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.goldeasy.common.exception.UserModuleException;
import com.goldeasy.common.redis.RedisService;
import com.goldeasy.common.response.CommonResponse;
import com.goldeasy.common.response.ResponseEnum;
import com.goldeasy.common.util.DateTimeUtil;
import com.goldeasy.user.entity.UserAccountInfo;
import com.goldeasy.user.entity.UserGoldAccountInfo;
import com.goldeasy.user.entity.UserInfo;
import com.goldeasy.user.entity.UserMarkAccountInfo;
import com.goldeasy.user.mapper.UserAccountInfoMapper;
import com.goldeasy.user.mapper.UserGoldAccountInfoMapper;
import com.goldeasy.user.mapper.UserInfoMapper;
import com.goldeasy.user.mapper.UserMarkAccountInfoMapper;
import com.goldeasy.user.service.UserService;

import com.goldeasy.user.util.HttpUtil;
import com.goldeasy.user.util.JwtUtil;
import com.goldeasy.user.util.Md5Util;
import com.goldeasy.user.vo.UserInfoVO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * @author:tianliya
 * @CreateTime:2018-10-15 16:50
 * @Description:用户业务实现类
 **/
@Component
@Service(interfaceClass = UserService.class, version = "1.0.0")
public class UserServiceImpl implements UserService {
    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    /**
     * 总经理id
     */
    @Value("${userInfo.generalManagerId}")
    private String generalManagerId;
    /**
     * 总监id
     */
    @Value("${userInfo.marketingDirectorId}")
    private String marketingDirectorId;
    /**
     * 经理id
     */
    @Value("${userInfo.managerId}")
    private String managerId;
    /**
     * 主管id
     */
    @Value("${userInfo.directorId}")
    private String directorId;
    /**
     * 经纪人id
     */
    @Value("${userInfo.brokerId}")
    private String brokerId;
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserMarkAccountInfoMapper userMarkAccountInfoMapper;
    @Autowired
    private UserGoldAccountInfoMapper userGoldAccountInfoMapper;
    @Autowired
    private UserAccountInfoMapper userAccountInfoMapper;
    @Resource
    private RedisService redisService;


    /**
     * fetch 用户注册的业务接口，创建用户账号，初始化用户账户信息表、用户积分表、用户黄金账户表
     *
     * @param userInfoVO 用户手机号
     * @return CommonResponse
     * @author: tianliya
     * @time: 2018/10/22
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public CommonResponse register(UserInfoVO userInfoVO) {
        try {
            Long userId = this.initUserInfo(userInfoVO);
            if (userId != null) {
                //调用初始化用户信息方法
                if (this.initUserAccount(userId)) {
                    //调用初始化黄金账户信息方法
                    if (this.initUserGoldAccount(userId)) {
                        //调用初始化积分账户信息方法
                        if (this.initUserMarkAccount(userId)) {
                            return CommonResponse.response(ResponseEnum.SUCCESS.getCode(), "注册成功");
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new UserModuleException("用户注册异常");
        }
        return CommonResponse.response(ResponseEnum.FAILED.getCode(), "注册失败");
    }

    /**
     * fetch 用户登陆功能业务接口，
     *
     * @param phone    用户手机号
     * @param password 用户密码
     * @return CommonResponse
     * @author: tianliya
     * @time: 2018/10/22
     */

    @Override
    public CommonResponse login(String phone, String password, HttpServletRequest request) throws Exception {
        this.logger.info("根据用户名获取用户信息，用户信息：{}", phone);
        //判断用户是否存在或
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(phone);
        UserInfo userInfoQuery = this.userInfoMapper.selectOne(userInfo);
        if (userInfoQuery != null) {
            //判断用户密码是否正确
            if (!Md5Util.getMD5Str(password).equals(userInfoQuery.getPassword())) {
                //设置登陆IP
                userInfoQuery.setLoginTime(DateTimeUtil.toDate(LocalDate.now()));
                //设置登陆时间
                userInfoQuery.setLoginFrom(HttpUtil.getLoginWay(request));
                //设置登陆设备
                userInfoQuery.setLoginIp(HttpUtil.getIp(request));
                //更新登陆信息
                this.userInfoMapper.updateByPrimaryKeySelective(userInfo);
            }
        }
        long nowMillis = System.currentTimeMillis();
        //调用JWT生成token
        String token = JwtUtil
                .createJWT(String.valueOf(userInfoQuery.getId()), userInfoQuery.getUserName(),
                        nowMillis);

        //将登陆信息存储到redis中  有限时间未7天
        redisService.put(String.valueOf(userInfoQuery.getId()), String.valueOf(nowMillis),24*7*60);
        //将token返回给浏览器
        return CommonResponse.response(1001,"登陆成功",token);
    }

    /**
     * fetch 用户修改密码业务接口
     *
     * @param password 用户新密码
     * @return CommonResponse
     * @author: tianliya
     * @time: 2018/10/22
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public CommonResponse modifyPassword(String password) {
        return null;
    }

    /**
     * fetch 初始化用户的信息表
     *
     * @param userInfoVO
     * @return
     * @author: tianliya
     * @time: 2018/10/22
     */
    private Long initUserInfo(UserInfoVO userInfoVO) {
        this.logger.info("初始化用户信息表数据，用户信息：{}", userInfoVO.toString());
        //插入UserInfo数据
        UserInfo userInfo = new UserInfo();
        //设置密码
        userInfo.setPassword(userInfoVO.getPassword());
        //设置总经理id
        if (userInfoVO.getGeneralManagerId() != null) {
            userInfo.setGeneralManagerId(userInfoVO.getGeneralManagerId());
        } else {
            userInfo.setGeneralManagerId(Long.parseLong(this.generalManagerId));
        }
        //设置总监id
        if (userInfoVO.getMarketingDirectorId() != null) {
            userInfo.setMarketingDirectorId(userInfoVO.getMarketingDirectorId());
        } else {
            userInfo.setMarketingDirectorId(Long.parseLong(this.marketingDirectorId));
        }
        //设置经理id
        if (userInfoVO.getManagerId() != null) {
            userInfo.setManagerId(userInfoVO.getManagerId());
        } else {
            userInfo.setManagerId(Long.parseLong(this.managerId));
        }
        //设置主管id
        if (userInfoVO.getDirectorId() != null) {
            userInfo.setDirectorId(userInfoVO.getDirectorId());
        } else {
            userInfo.setDirectorId(Long.parseLong(this.directorId));
        }
        //设置经纪人id
        if (userInfoVO.getBrokerId() != null) {
            userInfo.setBrokerId(userInfoVO.getBrokerId());
        } else {
            userInfo.setBrokerId(Long.parseLong(this.brokerId));
        }
        //设置添加时间
        userInfo.setRegisterTime(DateTimeUtil.toDate(LocalDate.now()));
        //设置注册IP
        userInfo.setRegisterIp(userInfoVO.getRegisterIp());
        //设置注册设备
        userInfo.setRegisterFrom(userInfoVO.getRegisterDevice());
        try {
            this.userInfoMapper.insertSelective(userInfo);
        } catch (Exception e) {
            this.logger.error("用户注册异常");
            throw new UserModuleException("用户注册异常", e.getCause());
        }
        return userInfo.getId();
    }

    /**
     * fetch 初始化用户的账户表
     *
     * @param userId
     * @return
     * @author: tianliya
     * @time: 2018/10/22
     */
    private Boolean initUserAccount(Long userId) {
        this.logger.info("初始化用户账户表数据，用户id：{}", userId);
        UserAccountInfo userAccountInfo = new UserAccountInfo();
        //设置用户id
        userAccountInfo.setUserId(userId);
        //设置添加数据时间
        userAccountInfo.setGmtCreate(DateTimeUtil.toDate(LocalDate.now()));
        try {
            int flag = this.userAccountInfoMapper.insertSelective(userAccountInfo);
            if (flag > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.logger.error("初始化用户账户表数据异常，异常信息：{}", e.getCause());
            e.printStackTrace();
            throw new UserModuleException("初始化用户账户表数据异常", e.getCause());
        }
    }

    /**
     * fetch 初始化用户的积分账户信息
     *
     * @param userId 用户id
     * @return
     * @author: tianliya
     * @time: 2018/10/22
     */
    private Boolean initUserMarkAccount(Long userId) {
        this.logger.info("初始化用户积分账户数据，用户id：{}", userId);
        UserMarkAccountInfo userMarkAccountInfo = new UserMarkAccountInfo();
        userMarkAccountInfo.setUserId(userId);
        //设置初始化时间
        userMarkAccountInfo.setGmtCreate(DateTimeUtil.toDate(LocalDate.now()));
        try {
            int flag = this.userMarkAccountInfoMapper.insertSelective(userMarkAccountInfo);
            if (flag > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.logger.error("初始化用户积分账户数据异常，异常信息：{}", e.getCause());
            throw new UserModuleException("初始化用户积分账户数据异常", e.getCause());
        }

    }

    /**
     * fetch 初始化用户的黄金账户信息
     *
     * @param userId 用户id
     * @return
     * @author: tianliya
     * @time: 2018/10/22
     */
    private Boolean initUserGoldAccount(Long userId) {
        this.logger.info("初始化用户黄金账户信息，用户id：{}", userId);
        UserGoldAccountInfo userGoldAccountInfo = new UserGoldAccountInfo();
        userGoldAccountInfo.setUserId(userId);
        //设置初始化时间
        userGoldAccountInfo.setGmtCreate(DateTimeUtil.toDate(LocalDate.now()));
        try {
            int flag = this.userGoldAccountInfoMapper.insertSelective(userGoldAccountInfo);
            if (flag > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.logger.error("初始化用户黄金账户信息异常，异常信息：{}", e.getCause());
            throw new UserModuleException("初始化用户黄金账户信息异常", e.getCause());
        }

    }
}
