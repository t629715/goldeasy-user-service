package com.goldeasy.user.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "user_account_info")
public class UserAccountInfo {
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
     * 账户余额(分)
     */
    private BigDecimal rmb;

    /**
     * 理财收益(分)
     */
    private BigDecimal income;

    /**
     * 冻结金额(分)
     */
    @Column(name = "frozen_rmb")
    private BigDecimal frozenRmb;

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
     * 获取账户余额(分)
     *
     * @return rmb - 账户余额(分)
     */
    public BigDecimal getRmb() {
        return rmb;
    }

    /**
     * 设置账户余额(分)
     *
     * @param rmb 账户余额(分)
     */
    public void setRmb(BigDecimal rmb) {
        this.rmb = rmb;
    }

    /**
     * 获取理财收益(分)
     *
     * @return income - 理财收益(分)
     */
    public BigDecimal getIncome() {
        return income;
    }

    /**
     * 设置理财收益(分)
     *
     * @param income 理财收益(分)
     */
    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    /**
     * 获取冻结金额(分)
     *
     * @return frozen_rmb - 冻结金额(分)
     */
    public BigDecimal getFrozenRmb() {
        return frozenRmb;
    }

    /**
     * 设置冻结金额(分)
     *
     * @param frozenRmb 冻结金额(分)
     */
    public void setFrozenRmb(BigDecimal frozenRmb) {
        this.frozenRmb = frozenRmb;
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