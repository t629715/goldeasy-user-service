package com.goldeasy.user.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: tianliya
 * @date: 2018/10/25
 * @description: 用于用户银行卡列表展示
 */
public class UserBankVO implements Serializable {


    private static final long serialVersionUID = 7584868047199200303L;
    /**
     * 用户绑定的银行卡的id
     */
    private Long id;

    /**
     * 用户的银行卡号
     */
    private String bankCardNum;
    /**
     * 银行卡图标
     */
    private String bankIcon;
    /**
     * 银行卡背景图
     */
    private String bankIconBackground;
    /**
     * 银行名称
     */
    private String bankName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getBankCardNum() {
        return bankCardNum;
    }

    public void setBankCardNum(String bankCardNum) {
        this.bankCardNum = bankCardNum;
    }

    public String getBankIcon() {
        return bankIcon;
    }

    public void setBankIcon(String bankIcon) {
        this.bankIcon = bankIcon;
    }

    public String getBankIconBackground() {
        return bankIconBackground;
    }

    public void setBankIconBackground(String bankIconBackground) {
        this.bankIconBackground = bankIconBackground;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "UserBankListVO{" +
                "id=" + id +
                ", bankCardNum='" + bankCardNum + '\'' +
                ", bankIcon='" + bankIcon + '\'' +
                ", bankIconBackground='" + bankIconBackground + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
