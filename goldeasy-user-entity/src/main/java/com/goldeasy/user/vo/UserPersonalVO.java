package com.goldeasy.user.vo;

import java.io.Serializable;

/**
 * @author: tianliya
 * @date: 2018/10/24
 * @description: 用于个人信息页面展示
 */
public class UserPersonalVO implements Serializable {


    private static final long serialVersionUID = 7703277377527675731L;
    /**
     * 用户头像地址
     */
    private String userHeadImage;

    public String getUserHeadImage() {
        return userHeadImage;
    }

    public void setUserHeadImage(String userHeadImage) {
        this.userHeadImage = userHeadImage;
    }

    @Override
    public String toString() {
        return "UserPersonalVO{" +
                "userHeadImage='" + userHeadImage + '\'' +
                '}';
    }
}
