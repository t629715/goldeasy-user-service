package com.goldeasy.user.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: tianliya
 * @date: 2018/10/25
 * @description: 用户添加银行卡传递
 */
public class UserBankCardDTO implements Serializable {


    private static final long serialVersionUID = 8312293272973906996L;
    /**
     * 开户行id
     */
    private Long bankId;
    /**
     * 银行卡号
     */
    private String bankCardNum;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 添加时间
     */
    private Date gmtCreate;

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public String getBankCardNum() {
        return bankCardNum;
    }

    public void setBankCardNum(String bankCardNum) {
        this.bankCardNum = bankCardNum;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Override
    public String toString() {
        return "UserBankCardDTO{" +
                "bankId=" + bankId +
                ", bankCardNum='" + bankCardNum + '\'' +
                ", userId=" + userId +
                ", gmtCreate=" + gmtCreate +
                '}';
    }
}
