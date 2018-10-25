package com.goldeasy.user.service;

import com.goldeasy.user.dto.UserLoginDTO;
import com.goldeasy.user.dto.UserRegisterDTO;
import com.goldeasy.user.vo.SysBankVO;
import com.goldeasy.user.vo.UserInfoVO;
import com.goldeasy.user.vo.UserNickNameVO;
import com.goldeasy.user.vo.UserPersonalVO;

import java.util.List;
import java.util.Map;

/**
 * @author:tianliya
 * @CreateTime:2018-10-15 17:11
 * @Description:用户业务接口
 **/
public interface UserService {
    /**
     * fetch 用户注册的业务接口，创建用户账号，初始化用户账户信息表、用户积分表、用户黄金账户表
     * @author: tianliya
     * @time: 2018/10/22
     * @param userRegisterDTO 用户手机号、密码、归属信息类
     * @return CommonResponse
     */
    String register(UserRegisterDTO userRegisterDTO);

    /**
     * fetch 用户登陆功能业务接口，
     * @author: tianliya
     * @time: 2018/10/22
     * @param userLoginDTO
     * @return CommonResponse
     */
    Map login(UserLoginDTO userLoginDTO);

    /**
     * fetch 用户修改密码业务接口
     * @author: tianliya
     * @time: 2018/10/22
     * @param password 用户新密码
     * @param userId
     * @return CommonResponse
     */
    Boolean modifyPassword(String password, Long userId);


    /**
     * fetch 用户修改密码-验证旧密码是否正确
     * @author: tianliya
     * @time: 2018/10/22
     * @param password 用户旧密码
     * @param userId
     * @return CommonResponse
     */
    Boolean validatePassword(String password, Long userId);

    /**
     * fetch 根据用户的id获取用户的信息
     * @author: tianliya
     * @time: 2018/10/23
     * @param userId
     * @return
     */
    UserInfoVO getUserInfoById(Long userId);

    /**
     * fetch 获取用户的头像地址
     * @author: tianliya
     * @time: 2018/10/24
     * @param userId
     * @return
     */
    UserPersonalVO getUserHeadImage(Long userId);

    /**
     * fetch 湖区用户昵称
     * @author: tianliya
     * @time: 2018/10/24
     * @param userId
     * @return
     */
    UserNickNameVO getUserNickName(Long userId);

    /**
     * fetch 用户修改昵称
     * @author: tianliya
     * @time: 2018/10/24
     * @param userId
     * @param userNickName
     * @return
     */
    Boolean updateUserNickName(Long userId, String userNickName);

    /**
     * fetch 修改头像
     * @author: tianliya
     * @time: 2018/10/24
     * @param userId
     * @param userHeadImage
     * @return
     */
    Boolean updateUserHeadImage(Long userId, String userHeadImage);

    /**
     * fetch 获取开户行列表信息
     * @author: tianliya
     * @time: 2018/10/25
     * @return
     */
    List<SysBankVO> listSysBank();





}
