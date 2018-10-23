package com.goldeasy.user.dto;

import java.io.Serializable;

/**
 * @author: tianliya
 * @date: 2018/10/23
 * @description: 用户登陆传递参数
 */
public class UserLoginDTO implements Serializable {

    private static final long serialVersionUID = 8560150986880843131L;

    private String phone;
    private String password;
    private String loginIp;
    private String loginFrom;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLoginFrom() {
        return loginFrom;
    }

    public void setLoginFrom(String loginFrom) {
        this.loginFrom = loginFrom;
    }

    @Override
    public String toString() {
        return "UserLoginDTO{" +
                "phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", loginIp='" + loginIp + '\'' +
                ", loginFrom='" + loginFrom + '\'' +
                '}';
    }
}
