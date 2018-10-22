package com.goldeasy.user.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "user_action_control")
public class UserActionControl {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 登陆行为-1：允许登陆，2：不允许
     */
    @Column(name = "user_login_action")
    private Short userLoginAction;

    /**
     * 充值行为-1：允许充值，2：不允许
     */
    @Column(name = "user_recharge_action")
    private Short userRechargeAction;

    /**
     * 交割行为-1：允许交割，2：不允许
     */
    @Column(name = "user_delivery_action")
    private Short userDeliveryAction;

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
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取登陆行为-1：允许登陆，2：不允许
     *
     * @return user_login_action - 登陆行为-1：允许登陆，2：不允许
     */
    public Short getUserLoginAction() {
        return userLoginAction;
    }

    /**
     * 设置登陆行为-1：允许登陆，2：不允许
     *
     * @param userLoginAction 登陆行为-1：允许登陆，2：不允许
     */
    public void setUserLoginAction(Short userLoginAction) {
        this.userLoginAction = userLoginAction;
    }

    /**
     * 获取充值行为-1：允许充值，2：不允许
     *
     * @return user_recharge_action - 充值行为-1：允许充值，2：不允许
     */
    public Short getUserRechargeAction() {
        return userRechargeAction;
    }

    /**
     * 设置充值行为-1：允许充值，2：不允许
     *
     * @param userRechargeAction 充值行为-1：允许充值，2：不允许
     */
    public void setUserRechargeAction(Short userRechargeAction) {
        this.userRechargeAction = userRechargeAction;
    }

    /**
     * 获取交割行为-1：允许交割，2：不允许
     *
     * @return user_delivery_action - 交割行为-1：允许交割，2：不允许
     */
    public Short getUserDeliveryAction() {
        return userDeliveryAction;
    }

    /**
     * 设置交割行为-1：允许交割，2：不允许
     *
     * @param userDeliveryAction 交割行为-1：允许交割，2：不允许
     */
    public void setUserDeliveryAction(Short userDeliveryAction) {
        this.userDeliveryAction = userDeliveryAction;
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