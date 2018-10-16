package com.goldeasy.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.goldeasy.user.service.UserService;

import org.springframework.stereotype.Component;

/**
 * @author:tianliya
 * @CreateTime:2018-10-15 16:50
 * @Description:用户业务实现类
 **/
@Component
@Service(interfaceClass = UserService.class,version = "1.0.0")
public class UserServiceImpl implements UserService{
}
