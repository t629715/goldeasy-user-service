package com.goldeasy.user.vo;

import java.io.Serializable;

/**
 * @author: tianliya
 * @date: 2018/10/26
 * @description: 用户实名认证展示数据
 */
public class UserRealNameAuthVO implements Serializable {


    private static final long serialVersionUID = -5716460265515989188L;
    /**
     * 身份证背面
     */
    private String idCardBack;
    /**
     * 身份证正面
     */
    private String idCardPositive;
    /**
     * 实名认证状态
     */
    private Short realNameAuthState;
    /**
     * 身份证号
     */
    private String userIdCard;
    /**
     * 真实姓名
     */
    private String userRealName;

    public String getIdCardBack() {
        return idCardBack;
    }

    public void setIdCardBack(String idCardBack) {
        this.idCardBack = idCardBack;
    }

    public String getIdCardPositive() {
        return idCardPositive;
    }

    public void setIdCardPositive(String idCardPositive) {
        this.idCardPositive = idCardPositive;
    }

    public Short getRealNameAuthState() {
        return realNameAuthState;
    }

    public void setRealNameAuthState(Short realNameAuthState) {
        this.realNameAuthState = realNameAuthState;
    }

    public String getUserIdCard() {
        return userIdCard;
    }

    public void setUserIdCard(String userIdCard) {
        this.userIdCard = userIdCard;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    @Override
    public String toString() {
        return "UserRealNameAuthVO{" +
                "idCardBack='" + idCardBack + '\'' +
                ", idCardPositive='" + idCardPositive + '\'' +
                ", realNameAuthState=" + realNameAuthState +
                ", userIdCard='" + userIdCard + '\'' +
                ", userRealName='" + userRealName + '\'' +
                '}';
    }
}
