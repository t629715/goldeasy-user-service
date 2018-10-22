package com.goldeasy.user.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "user_bank_card")
public class UserBankCard {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 银行id
     */
    @Column(name = "bank_id")
    private Long bankId;

    /**
     * 银行账号
     */
    @Column(name = "bank_card_num")
    private String bankCardNum;

    /**
     * 1：默认，0：非默认
     */
    @Column(name = "default_or_not")
    private Boolean defaultOrNot;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 更新时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取银行id
     *
     * @return bank_id - 银行id
     */
    public Long getBankId() {
        return bankId;
    }

    /**
     * 设置银行id
     *
     * @param bankId 银行id
     */
    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    /**
     * 获取银行账号
     *
     * @return bank_card_num - 银行账号
     */
    public String getBankCardNum() {
        return bankCardNum;
    }

    /**
     * 设置银行账号
     *
     * @param bankCardNum 银行账号
     */
    public void setBankCardNum(String bankCardNum) {
        this.bankCardNum = bankCardNum;
    }

    /**
     * 获取1：默认，0：非默认
     *
     * @return default_or_not - 1：默认，0：非默认
     */
    public Boolean getDefaultOrNot() {
        return defaultOrNot;
    }

    /**
     * 设置1：默认，0：非默认
     *
     * @param defaultOrNot 1：默认，0：非默认
     */
    public void setDefaultOrNot(Boolean defaultOrNot) {
        this.defaultOrNot = defaultOrNot;
    }

    /**
     * 获取创建时间
     *
     * @return gmt_create - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取更新时间
     *
     * @return gmt_modified - 更新时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置更新时间
     *
     * @param gmtModified 更新时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}