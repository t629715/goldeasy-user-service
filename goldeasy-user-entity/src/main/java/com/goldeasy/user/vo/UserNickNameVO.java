package com.goldeasy.user.vo;

import java.io.Serializable;

/**
 * @author: tianliya
 * @date: 2018/10/24
 * @description: 用于昵称页面展示用户昵称
 */
public class UserNickNameVO implements Serializable {

    private static final long serialVersionUID = 5576521430078471444L;
    /**
     * 用户昵称
     */
    private String userNickName;

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    @Override
    public String toString() {
        return "UserNickNameVO{" +
                "userNickName='" + userNickName + '\'' +
                '}';
    }
}
