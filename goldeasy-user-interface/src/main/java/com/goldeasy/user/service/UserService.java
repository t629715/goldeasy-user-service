package com.goldeasy.user.service;

import com.goldeasy.common.response.CommonResponse;
import com.goldeasy.user.vo.UserInfoVO;

import javax.servlet.http.HttpServletRequest;

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
     * @param userInfoVO 用户手机号、密码、归属信息类
     * @return CommonResponse
     */
    CommonResponse register(UserInfoVO userInfoVO);

    /**
     * fetch 用户登陆功能业务接口，
     * @author: tianliya
     * @time: 2018/10/22
     * @param phone
     * @return CommonResponse
     */
    CommonResponse login(String phone, String password, HttpServletRequest request) throws Exception;

    /**
     * fetch 用户修改密码业务接口
     * @author: tianliya
     * @time: 2018/10/22
     * @param password 用户新密码
     * @return CommonResponse
     */
    CommonResponse modifyPassword(String password);


}
