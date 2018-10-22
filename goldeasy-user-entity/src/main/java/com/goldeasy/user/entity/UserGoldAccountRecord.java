package com.goldeasy.user.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "user_gold_account_record")
public class UserGoldAccountRecord {
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
     * 用户名
     */
    @Column(name = "user_uame")
    private String userUame;

    /**
     * 进出方向 1：进 2：出 
     */
    private Short side;

    /**
     * 黄金
     */
    private BigDecimal gold;

    /**
     * 变更前黄金余额
     */
    @Column(name = "pre_gold")
    private BigDecimal preGold;

    /**
     * 变更后黄金余额
     */
    @Column(name = "after_gold")
    private BigDecimal afterGold;

    /**
     * 变更原因
     */
    @Column(name = "alter_reason")
    private String alterReason;

    /**
     * 总经理id
     */
    @Column(name = "general_manager_id")
    private Long generalManagerId;

    /**
     * 市场总监id
     */
    @Column(name = "marketing_director_id")
    private Long marketingDirectorId;

    /**
     * 经理id
     */
    @Column(name = "manager_id")
    private Long managerId;

    /**
     * 主管id
     */
    @Column(name = "director_id")
    private Long directorId;

    /**
     * 经纪人id
     */
    @Column(name = "broker_id")
    private Long brokerId;

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
     * 获取用户名
     *
     * @return user_uame - 用户名
     */
    public String getUserUame() {
        return userUame;
    }

    /**
     * 设置用户名
     *
     * @param userUame 用户名
     */
    public void setUserUame(String userUame) {
        this.userUame = userUame;
    }

    /**
     * 获取进出方向 1：进 2：出 
     *
     * @return side - 进出方向 1：进 2：出 
     */
    public Short getSide() {
        return side;
    }

    /**
     * 设置进出方向 1：进 2：出 
     *
     * @param side 进出方向 1：进 2：出 
     */
    public void setSide(Short side) {
        this.side = side;
    }

    /**
     * 获取黄金
     *
     * @return gold - 黄金
     */
    public BigDecimal getGold() {
        return gold;
    }

    /**
     * 设置黄金
     *
     * @param gold 黄金
     */
    public void setGold(BigDecimal gold) {
        this.gold = gold;
    }

    /**
     * 获取变更前黄金余额
     *
     * @return pre_gold - 变更前黄金余额
     */
    public BigDecimal getPreGold() {
        return preGold;
    }

    /**
     * 设置变更前黄金余额
     *
     * @param preGold 变更前黄金余额
     */
    public void setPreGold(BigDecimal preGold) {
        this.preGold = preGold;
    }

    /**
     * 获取变更后黄金余额
     *
     * @return after_gold - 变更后黄金余额
     */
    public BigDecimal getAfterGold() {
        return afterGold;
    }

    /**
     * 设置变更后黄金余额
     *
     * @param afterGold 变更后黄金余额
     */
    public void setAfterGold(BigDecimal afterGold) {
        this.afterGold = afterGold;
    }

    /**
     * 获取变更原因
     *
     * @return alter_reason - 变更原因
     */
    public String getAlterReason() {
        return alterReason;
    }

    /**
     * 设置变更原因
     *
     * @param alterReason 变更原因
     */
    public void setAlterReason(String alterReason) {
        this.alterReason = alterReason;
    }

    /**
     * 获取总经理id
     *
     * @return general_manager_id - 总经理id
     */
    public Long getGeneralManagerId() {
        return generalManagerId;
    }

    /**
     * 设置总经理id
     *
     * @param generalManagerId 总经理id
     */
    public void setGeneralManagerId(Long generalManagerId) {
        this.generalManagerId = generalManagerId;
    }

    /**
     * 获取市场总监id
     *
     * @return marketing_director_id - 市场总监id
     */
    public Long getMarketingDirectorId() {
        return marketingDirectorId;
    }

    /**
     * 设置市场总监id
     *
     * @param marketingDirectorId 市场总监id
     */
    public void setMarketingDirectorId(Long marketingDirectorId) {
        this.marketingDirectorId = marketingDirectorId;
    }

    /**
     * 获取经理id
     *
     * @return manager_id - 经理id
     */
    public Long getManagerId() {
        return managerId;
    }

    /**
     * 设置经理id
     *
     * @param managerId 经理id
     */
    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    /**
     * 获取主管id
     *
     * @return director_id - 主管id
     */
    public Long getDirectorId() {
        return directorId;
    }

    /**
     * 设置主管id
     *
     * @param directorId 主管id
     */
    public void setDirectorId(Long directorId) {
        this.directorId = directorId;
    }

    /**
     * 获取经纪人id
     *
     * @return broker_id - 经纪人id
     */
    public Long getBrokerId() {
        return brokerId;
    }

    /**
     * 设置经纪人id
     *
     * @param brokerId 经纪人id
     */
    public void setBrokerId(Long brokerId) {
        this.brokerId = brokerId;
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