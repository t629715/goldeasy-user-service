package com.goldeasy.user.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author: adminisrator
 * @date: 2018/11/19
 * @description:
 */
public class UserMarkDTO implements Serializable {
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 变更积分
     */

    private BigDecimal mark;
    /**
     * 变更原因
     */
    private String alertReason;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getMark() {
        return mark;
    }

    public void setMark(BigDecimal mark) {
        this.mark = mark;
    }

    public String getAlertReason() {
        return alertReason;
    }

    public void setAlertReason(String alertReason) {
        this.alertReason = alertReason;
    }

    @Override
    public String toString() {
        return "UserMarkDTO{" +
                "userId=" + userId +
                ", mark=" + mark +
                ", alertReason='" + alertReason + '\'' +
                '}';
    }
}
