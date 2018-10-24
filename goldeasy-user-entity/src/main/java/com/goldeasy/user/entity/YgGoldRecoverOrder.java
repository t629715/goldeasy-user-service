package com.goldeasy.user.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "yg_gold_recover_order")
public class YgGoldRecoverOrder {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 订单回收金条价格
     */
    @Column(name = "recover_price")
    private BigDecimal recoverPrice;

    /**
     * 订单回收金金条克重
     */
    @Column(name = "gold_weight")
    private BigDecimal goldWeight;

    /**
     * 订单回收金条数量
     */
    @Column(name = "gold_num")
    private Integer goldNum;

    /**
     * 寄件人姓名
     */
    @Column(name = "sender_name")
    private String senderName;

    /**
     * 寄件人电话
     */
    @Column(name = "sender_phone")
    private String senderPhone;

    /**
     * 物流单号
     */
    @Column(name = "tracking_num")
    private String trackingNum;

    /**
     * 订单状态:0:待完善 1:已生效 2:已失效 3已取消4:已完成
     */
    private Short status;

    /**
     * 备用字段
     */
    private String spare;

    /**
     * 创建时间
     */
    @Column(name = "gtm_create")
    private Date gtmCreate;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 完成时间
     */
    @Column(name = "complete_time")
    private Date completeTime;

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
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
     * 获取订单回收金条价格
     *
     * @return recover_price - 订单回收金条价格
     */
    public BigDecimal getRecoverPrice() {
        return recoverPrice;
    }

    /**
     * 设置订单回收金条价格
     *
     * @param recoverPrice 订单回收金条价格
     */
    public void setRecoverPrice(BigDecimal recoverPrice) {
        this.recoverPrice = recoverPrice;
    }

    /**
     * 获取订单回收金金条克重
     *
     * @return gold_weight - 订单回收金金条克重
     */
    public BigDecimal getGoldWeight() {
        return goldWeight;
    }

    /**
     * 设置订单回收金金条克重
     *
     * @param goldWeight 订单回收金金条克重
     */
    public void setGoldWeight(BigDecimal goldWeight) {
        this.goldWeight = goldWeight;
    }

    /**
     * 获取订单回收金条数量
     *
     * @return gold_num - 订单回收金条数量
     */
    public Integer getGoldNum() {
        return goldNum;
    }

    /**
     * 设置订单回收金条数量
     *
     * @param goldNum 订单回收金条数量
     */
    public void setGoldNum(Integer goldNum) {
        this.goldNum = goldNum;
    }

    /**
     * 获取寄件人姓名
     *
     * @return sender_name - 寄件人姓名
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * 设置寄件人姓名
     *
     * @param senderName 寄件人姓名
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * 获取寄件人电话
     *
     * @return sender_phone - 寄件人电话
     */
    public String getSenderPhone() {
        return senderPhone;
    }

    /**
     * 设置寄件人电话
     *
     * @param senderPhone 寄件人电话
     */
    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    /**
     * 获取物流单号
     *
     * @return tracking_num - 物流单号
     */
    public String getTrackingNum() {
        return trackingNum;
    }

    /**
     * 设置物流单号
     *
     * @param trackingNum 物流单号
     */
    public void setTrackingNum(String trackingNum) {
        this.trackingNum = trackingNum;
    }

    /**
     * 获取订单状态:0:待完善 1:已生效 2:已失效 3已取消4:已完成
     *
     * @return status - 订单状态:0:待完善 1:已生效 2:已失效 3已取消4:已完成
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置订单状态:0:待完善 1:已生效 2:已失效 3已取消4:已完成
     *
     * @param status 订单状态:0:待完善 1:已生效 2:已失效 3已取消4:已完成
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取备用字段
     *
     * @return spare - 备用字段
     */
    public String getSpare() {
        return spare;
    }

    /**
     * 设置备用字段
     *
     * @param spare 备用字段
     */
    public void setSpare(String spare) {
        this.spare = spare;
    }

    /**
     * 获取创建时间
     *
     * @return gtm_create - 创建时间
     */
    public Date getGtmCreate() {
        return gtmCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gtmCreate 创建时间
     */
    public void setGtmCreate(Date gtmCreate) {
        this.gtmCreate = gtmCreate;
    }

    /**
     * 获取修改时间
     *
     * @return gmt_modified - 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置修改时间
     *
     * @param gmtModified 修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 获取完成时间
     *
     * @return complete_time - 完成时间
     */
    public Date getCompleteTime() {
        return completeTime;
    }

    /**
     * 设置完成时间
     *
     * @param completeTime 完成时间
     */
    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
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
}