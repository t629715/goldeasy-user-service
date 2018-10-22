package com.goldeasy.user.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "sys_bank")
public class SysBank {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 行名
     */
    @Column(name = "bank_name")
    private String bankName;

    /**
     * 排序号
     */
    @Column(name = "sort_no")
    private Short sortNo;

    /**
     * 有效标识 1：有效 2:无效
     */
    @Column(name = "bank_state")
    private Short bankState;

    /**
     * 银行图标
     */
    @Column(name = "bank_icon")
    private String bankIcon;

    /**
     * 银行背景图标
     */
    @Column(name = "bank_background_icon")
    private String bankBackgroundIcon;

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
     * 获取编号
     *
     * @return id - 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取行名
     *
     * @return bank_name - 行名
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置行名
     *
     * @param bankName 行名
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 获取排序号
     *
     * @return sort_no - 排序号
     */
    public Short getSortNo() {
        return sortNo;
    }

    /**
     * 设置排序号
     *
     * @param sortNo 排序号
     */
    public void setSortNo(Short sortNo) {
        this.sortNo = sortNo;
    }

    /**
     * 获取有效标识 1：有效 2:无效
     *
     * @return bank_state - 有效标识 1：有效 2:无效
     */
    public Short getBankState() {
        return bankState;
    }

    /**
     * 设置有效标识 1：有效 2:无效
     *
     * @param bankState 有效标识 1：有效 2:无效
     */
    public void setBankState(Short bankState) {
        this.bankState = bankState;
    }

    /**
     * 获取银行图标
     *
     * @return bank_icon - 银行图标
     */
    public String getBankIcon() {
        return bankIcon;
    }

    /**
     * 设置银行图标
     *
     * @param bankIcon 银行图标
     */
    public void setBankIcon(String bankIcon) {
        this.bankIcon = bankIcon;
    }

    /**
     * 获取银行背景图标
     *
     * @return bank_background_icon - 银行背景图标
     */
    public String getBankBackgroundIcon() {
        return bankBackgroundIcon;
    }

    /**
     * 设置银行背景图标
     *
     * @param bankBackgroundIcon 银行背景图标
     */
    public void setBankBackgroundIcon(String bankBackgroundIcon) {
        this.bankBackgroundIcon = bankBackgroundIcon;
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