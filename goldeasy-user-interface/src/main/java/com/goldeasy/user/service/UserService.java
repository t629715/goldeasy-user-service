package com.goldeasy.user.service;

import com.goldeasy.common.response.CommonResponse;
import com.goldeasy.user.dto.UserLoginDTO;
import com.goldeasy.user.dto.UserRegisterDTO;
import com.goldeasy.user.vo.UserInfoVO;

import javax.servlet.http.HttpServletRequest;
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





}
