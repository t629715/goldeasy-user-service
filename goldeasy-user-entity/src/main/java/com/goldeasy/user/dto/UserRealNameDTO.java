package com.goldeasy.user.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: tianliya
 * @date: 2018/10/26
 * @description: 用户实名认证数据传递
 */
public class UserRealNameDTO implements Serializable {

    private static final long serialVersionUID = -3785355540188662929L;
    /**
     * 用户id
     */
    private Long id;
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

    private Date realNameAuthApplyTime;

    public Date getRealNameAuthApplyTime() {
        return realNameAuthApplyTime;
    }

    public void setRealNameAuthApplyTime(Date realNameAuthApplyTime) {
        this.realNameAuthApplyTime = realNameAuthApplyTime;
    }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserRealNameDTO{" +
                "id=" + id +
                ", idCardBack='" + idCardBack + '\'' +
                ", idCardPositive='" + idCardPositive + '\'' +
                ", realNameAuthState=" + realNameAuthState +
                ", userIdCard='" + userIdCard + '\'' +
                ", userRealName='" + userRealName + '\'' +
                ", realNameAuthApplyTime=" + realNameAuthApplyTime +
                '}';
    }
}
