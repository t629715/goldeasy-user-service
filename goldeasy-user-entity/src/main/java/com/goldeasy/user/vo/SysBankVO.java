package com.goldeasy.user.vo;

import java.io.Serializable;

/**
 * @author: tianliya
 * @date: 2018/10/25
 * @description: 用户页面展示的开户行信息
 */
public class SysBankVO implements Serializable {

    private static final long serialVersionUID = 722782391919435311L;
    /**
     * 开户行id
     */
    private Long id;
    /**
     * 开户行名称
     */
    private String bankName;
    /**
     * 开户行图标
     */
    private String bankIcon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankIcon() {
        return bankIcon;
    }

    public void setBankIcon(String bankIcon) {
        this.bankIcon = bankIcon;
    }

    @Override
    public String toString() {
        return "SysBankListVO{" +
                "id=" + id +
                ", bankName='" + bankName + '\'' +
                ", bankIcon='" + bankIcon + '\'' +
                '}';
    }
}
