package com.goldeasy.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.goldeasy.common.exception.UserModuleException;
import com.goldeasy.common.redis.RedisService;
import com.goldeasy.common.util.DateTimeUtil;
import com.goldeasy.common.util.MD5Util;
import com.goldeasy.user.dto.UserBankCardDTO;
import com.goldeasy.user.dto.UserLoginDTO;
import com.goldeasy.user.dto.UserRegisterDTO;
import com.goldeasy.user.entity.UserAccountInfo;
import com.goldeasy.user.entity.UserGoldAccountInfo;
import com.goldeasy.user.entity.UserInfo;
import com.goldeasy.user.entity.UserMarkAccountInfo;
import com.goldeasy.user.mapper.*;
import com.goldeasy.user.service.UserBankCardService;
import com.goldeasy.user.service.UserService;
import com.goldeasy.user.util.JwtUtil;
import com.goldeasy.user.vo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author:tianliya
 * @CreateTime:2018-10-15 16:50
 * @Description:用户业务实现类
 **/
@Component
@Service(interfaceClass = UserBankCardService.class, version = "${dubbo.service.version}")
public class UserBankCardServiceImpl implements UserBankCardService {
    private final Logger logger = LoggerFactory.getLogger(UserBankCardServiceImpl.class);

    @Autowired
    private SysBankMapper sysBankMapper;
    @Autowired
    private UserBankCardMapper userBankCardMapper;

    /**
     * fetch 获取开户行列表
     * @author: tianliya
     * @time: 2018/10/25
     * @return
     */
    @Override

    public List<SysBankVO> listSysBank() {
        this.logger.info("获取开户行列表业务层");
        try{
            List<SysBankVO> sysBankVOList = this.sysBankMapper.listSysBank();
            return sysBankVOList;
        }catch (Exception e){
            e.printStackTrace();
            this.logger.error("获取开户行列表业务层,异常信息:{}",e.getMessage());
            throw new UserModuleException("获取开户行列表业务层");
        }
    }

    /**
     * fetch
     * @author: tianliya
     * @time: 2018/10/25
     * @param id
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean setDefault(Long id) {
        return null;
    }

    /**
     * fetch 绑定银行卡
     * @author: tianliya
     * @time: 2018/10/25
     * @param userBankCardDTO
     * @param userId
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean addUserBankCard(UserBankCardDTO userBankCardDTO, Long userId) {
        userBankCardDTO.setUserId(userId);
        userBankCardDTO.setGmtCreate(DateTimeUtil.toDate(LocalDateTime.now()));
        int flag = this.userBankCardMapper.addUserBankCard(userBankCardDTO);
        if (flag > 0){
            return true;
        }
        return false;
    }

    /**
     * 删除银行卡
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean deleteUserBankCard(Long id) {
        int flag = this.userBankCardMapper.deleteUserBankCard(id);
        if (flag > 0){
            return true;
        }
        return false;
    }

    /**
     * fetch 获取用户的银行卡列表
     * @author: tianliya
     * @time: 2018/10/25
     * @param userId
     * @return
     */
    @Override
    public List<UserBankVO> listUserBank(Long userId) {
        List<UserBankVO> userBankVOList = this.userBankCardMapper.listUserBankCard(userId);
        return userBankVOList;
    }
}
