package com.goldeasy.user.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "yg_gold_order")
public class YgGoldOrder implements Serializable {

    private static final long serialVersionUID = -68429404578248632L;
    /**
     * 主键
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
     * 订单编号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 金权交易订单编号
     */
    @Column(name = "jq_order_id")
    private Integer jqOrderId;

    /**
     * 买入总价（包括一口价-商城订单、预购-克重*买入价、金权交易-克重*行情）
     */
    @Column(name = "buy_amount")
    private BigDecimal buyAmount;

    /**
     * 黄金总价
     */
    @Column(name = "total_gold_amount")
    private BigDecimal totalGoldAmount;

    /**
     * 提金费用，只针对金权交易的订单
     */
    @Column(name = "total_withdraw_amount")
    private BigDecimal totalWithdrawAmount;

    /**
     * 订单总金额
     */
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 实际支付金额
     */
    @Column(name = "pay_amount")
    private BigDecimal payAmount;

    /**
     * 买入数量，比如几根金条
     */
    @Column(name = "buy_num")
    private Integer buyNum;

    /**
     * 买入黄金克重
     */
    @Column(name = "buy_weight")
    private Integer buyWeight;

    /**
     * 买入价，也就是行情价加上修正值
     */
    @Column(name = "buy_price")
    private BigDecimal buyPrice;

    /**
     * 手续费
     */
    private BigDecimal poundage;

    /**
     * 加工费
     */
    @Column(name = "processing_fee")
    private BigDecimal processingFee;

    /**
     * 发票费用
     */
    @Column(name = "invoice_fee")
    private BigDecimal invoiceFee;

    /**
     * 是否需要发票0否 1是
     */
    @Column(name = "is_invoice")
    private Byte isInvoice;

    /**
     * 发票类型，个人或者公司
     */
    @Column(name = "invoice_type")
    private String invoiceType;

    /**
     * 发票信息
     */
    @Column(name = "invoice_info")
    private String invoiceInfo;

    /**
     * 发票邮箱
     */
    @Column(name = "invoice_mail")
    private String invoiceMail;

    /**
     * 保管费
     */
    @Column(name = "storage_fee")
    private BigDecimal storageFee;

    /**
     * 包装费
     */
    @Column(name = "packing_fee")
    private BigDecimal packingFee;

    /**
     * 物流费
     */
    @Column(name = "logistic_fee")
    private BigDecimal logisticFee;

    /**
     * 优惠券抵扣值
     */
    @Column(name = "voucher_value")
    private BigDecimal voucherValue;

    /**
     * 优惠券id
     */
    @Column(name = "voucher_id")
    private Long voucherId;

    /**
     * 积分抵扣的钱数
     */
    @Column(name = "integral_value")
    private BigDecimal integralValue;

    /**
     * 使用的积分
     */
    @Column(name = "used_integral")
    private Integer usedIntegral;

    /**
     * 收货人
     */
    private String receiver;

    /**
     * 收货人联系方式
     */
    @Column(name = "receiver_phone")
    private String receiverPhone;

    /**
     * 收货地址
     */
    @Column(name = "receive_address")
    private String receiveAddress;

    /**
     * 物流单号
     */
    @Column(name = "logistic_no")
    private String logisticNo;

    /**
     * 交割提金类型，0 自动交割（强制平仓和自动平仓的订单），1 手动交割，点击提金按钮
     */
    @Column(name = "delivery_type")
    private Short deliveryType;

    /**
     * 订单状态（0未支付、1已支付、2已发货、已完成、作废）
     */
    @Column(name = "order_state")
    private Short orderState;

    /**
     * 0预购订单、1商城订单、2金权交易的提金订单
     */
    @Column(name = "order_type")
    private Short orderType;

    /**
     * 创建时间或者提金时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 发货时间
     */
    @Column(name = "send_time")
    private Date sendTime;

    /**
     * 完成或者作废时间
     */
    @Column(name = "complete_time")
    private Date completeTime;

    /**
     * 订单配置信息，金权交易提金订单配置信息、预购配置信息、商城配置信息
     */
    private String conf;

    /**
     * 备用字段
     */
    private String spare;

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
     * 获取订单编号
     *
     * @return order_no - 订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单编号
     *
     * @param orderNo 订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取金权交易订单编号
     *
     * @return jq_order_id - 金权交易订单编号
     */
    public Integer getJqOrderId() {
        return jqOrderId;
    }

    /**
     * 设置金权交易订单编号
     *
     * @param jqOrderId 金权交易订单编号
     */
    public void setJqOrderId(Integer jqOrderId) {
        this.jqOrderId = jqOrderId;
    }

    /**
     * 获取买入总价（包括一口价-商城订单、预购-克重*买入价、金权交易-克重*行情）
     *
     * @return buy_amount - 买入总价（包括一口价-商城订单、预购-克重*买入价、金权交易-克重*行情）
     */
    public BigDecimal getBuyAmount() {
        return buyAmount;
    }

    /**
     * 设置买入总价（包括一口价-商城订单、预购-克重*买入价、金权交易-克重*行情）
     *
     * @param buyAmount 买入总价（包括一口价-商城订单、预购-克重*买入价、金权交易-克重*行情）
     */
    public void setBuyAmount(BigDecimal buyAmount) {
        this.buyAmount = buyAmount;
    }

    /**
     * 获取黄金总价
     *
     * @return total_gold_amount - 黄金总价
     */
    public BigDecimal getTotalGoldAmount() {
        return totalGoldAmount;
    }

    /**
     * 设置黄金总价
     *
     * @param totalGoldAmount 黄金总价
     */
    public void setTotalGoldAmount(BigDecimal totalGoldAmount) {
        this.totalGoldAmount = totalGoldAmount;
    }

    /**
     * 获取提金费用，只针对金权交易的订单
     *
     * @return total_withdraw_amount - 提金费用，只针对金权交易的订单
     */
    public BigDecimal getTotalWithdrawAmount() {
        return totalWithdrawAmount;
    }

    /**
     * 设置提金费用，只针对金权交易的订单
     *
     * @param totalWithdrawAmount 提金费用，只针对金权交易的订单
     */
    public void setTotalWithdrawAmount(BigDecimal totalWithdrawAmount) {
        this.totalWithdrawAmount = totalWithdrawAmount;
    }

    /**
     * 获取订单总金额
     *
     * @return total_amount - 订单总金额
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置订单总金额
     *
     * @param totalAmount 订单总金额
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取实际支付金额
     *
     * @return pay_amount - 实际支付金额
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * 设置实际支付金额
     *
     * @param payAmount 实际支付金额
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * 获取买入数量，比如几根金条
     *
     * @return buy_num - 买入数量，比如几根金条
     */
    public Integer getBuyNum() {
        return buyNum;
    }

    /**
     * 设置买入数量，比如几根金条
     *
     * @param buyNum 买入数量，比如几根金条
     */
    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    /**
     * 获取买入黄金克重
     *
     * @return buy_weight - 买入黄金克重
     */
    public Integer getBuyWeight() {
        return buyWeight;
    }

    /**
     * 设置买入黄金克重
     *
     * @param buyWeight 买入黄金克重
     */
    public void setBuyWeight(Integer buyWeight) {
        this.buyWeight = buyWeight;
    }

    /**
     * 获取买入价，也就是行情价加上修正值
     *
     * @return buy_price - 买入价，也就是行情价加上修正值
     */
    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    /**
     * 设置买入价，也就是行情价加上修正值
     *
     * @param buyPrice 买入价，也就是行情价加上修正值
     */
    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    /**
     * 获取手续费
     *
     * @return poundage - 手续费
     */
    public BigDecimal getPoundage() {
        return poundage;
    }

    /**
     * 设置手续费
     *
     * @param poundage 手续费
     */
    public void setPoundage(BigDecimal poundage) {
        this.poundage = poundage;
    }

    /**
     * 获取加工费
     *
     * @return processing_fee - 加工费
     */
    public BigDecimal getProcessingFee() {
        return processingFee;
    }

    /**
     * 设置加工费
     *
     * @param processingFee 加工费
     */
    public void setProcessingFee(BigDecimal processingFee) {
        this.processingFee = processingFee;
    }

    /**
     * 获取发票费用
     *
     * @return invoice_fee - 发票费用
     */
    public BigDecimal getInvoiceFee() {
        return invoiceFee;
    }

    /**
     * 设置发票费用
     *
     * @param invoiceFee 发票费用
     */
    public void setInvoiceFee(BigDecimal invoiceFee) {
        this.invoiceFee = invoiceFee;
    }

    /**
     * 获取是否需要发票0否 1是
     *
     * @return is_invoice - 是否需要发票0否 1是
     */
    public Byte getIsInvoice() {
        return isInvoice;
    }

    /**
     * 设置是否需要发票0否 1是
     *
     * @param isInvoice 是否需要发票0否 1是
     */
    public void setIsInvoice(Byte isInvoice) {
        this.isInvoice = isInvoice;
    }

    /**
     * 获取发票类型，个人或者公司
     *
     * @return invoice_type - 发票类型，个人或者公司
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * 设置发票类型，个人或者公司
     *
     * @param invoiceType 发票类型，个人或者公司
     */
    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    /**
     * 获取发票信息
     *
     * @return invoice_info - 发票信息
     */
    public String getInvoiceInfo() {
        return invoiceInfo;
    }

    /**
     * 设置发票信息
     *
     * @param invoiceInfo 发票信息
     */
    public void setInvoiceInfo(String invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }

    /**
     * 获取发票邮箱
     *
     * @return invoice_mail - 发票邮箱
     */
    public String getInvoiceMail() {
        return invoiceMail;
    }

    /**
     * 设置发票邮箱
     *
     * @param invoiceMail 发票邮箱
     */
    public void setInvoiceMail(String invoiceMail) {
        this.invoiceMail = invoiceMail;
    }

    /**
     * 获取保管费
     *
     * @return storage_fee - 保管费
     */
    public BigDecimal getStorageFee() {
        return storageFee;
    }

    /**
     * 设置保管费
     *
     * @param storageFee 保管费
     */
    public void setStorageFee(BigDecimal storageFee) {
        this.storageFee = storageFee;
    }

    /**
     * 获取包装费
     *
     * @return packing_fee - 包装费
     */
    public BigDecimal getPackingFee() {
        return packingFee;
    }

    /**
     * 设置包装费
     *
     * @param packingFee 包装费
     */
    public void setPackingFee(BigDecimal packingFee) {
        this.packingFee = packingFee;
    }

    /**
     * 获取物流费
     *
     * @return logistic_fee - 物流费
     */
    public BigDecimal getLogisticFee() {
        return logisticFee;
    }

    /**
     * 设置物流费
     *
     * @param logisticFee 物流费
     */
    public void setLogisticFee(BigDecimal logisticFee) {
        this.logisticFee = logisticFee;
    }

    /**
     * 获取优惠券抵扣值
     *
     * @return voucher_value - 优惠券抵扣值
     */
    public BigDecimal getVoucherValue() {
        return voucherValue;
    }

    /**
     * 设置优惠券抵扣值
     *
     * @param voucherValue 优惠券抵扣值
     */
    public void setVoucherValue(BigDecimal voucherValue) {
        this.voucherValue = voucherValue;
    }

    /**
     * 获取优惠券id
     *
     * @return voucher_id - 优惠券id
     */
    public Long getVoucherId() {
        return voucherId;
    }

    /**
     * 设置优惠券id
     *
     * @param voucherId 优惠券id
     */
    public void setVoucherId(Long voucherId) {
        this.voucherId = voucherId;
    }

    /**
     * 获取积分抵扣的钱数
     *
     * @return integral_value - 积分抵扣的钱数
     */
    public BigDecimal getIntegralValue() {
        return integralValue;
    }

    /**
     * 设置积分抵扣的钱数
     *
     * @param integralValue 积分抵扣的钱数
     */
    public void setIntegralValue(BigDecimal integralValue) {
        this.integralValue = integralValue;
    }

    /**
     * 获取使用的积分
     *
     * @return used_integral - 使用的积分
     */
    public Integer getUsedIntegral() {
        return usedIntegral;
    }

    /**
     * 设置使用的积分
     *
     * @param usedIntegral 使用的积分
     */
    public void setUsedIntegral(Integer usedIntegral) {
        this.usedIntegral = usedIntegral;
    }

    /**
     * 获取收货人
     *
     * @return receiver - 收货人
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * 设置收货人
     *
     * @param receiver 收货人
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * 获取收货人联系方式
     *
     * @return receiver_phone - 收货人联系方式
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * 设置收货人联系方式
     *
     * @param receiverPhone 收货人联系方式
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    /**
     * 获取收货地址
     *
     * @return receive_address - 收货地址
     */
    public String getReceiveAddress() {
        return receiveAddress;
    }

    /**
     * 设置收货地址
     *
     * @param receiveAddress 收货地址
     */
    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    /**
     * 获取物流单号
     *
     * @return logistic_no - 物流单号
     */
    public String getLogisticNo() {
        return logisticNo;
    }

    /**
     * 设置物流单号
     *
     * @param logisticNo 物流单号
     */
    public void setLogisticNo(String logisticNo) {
        this.logisticNo = logisticNo;
    }

    /**
     * 获取交割提金类型，0 自动交割（强制平仓和自动平仓的订单），1 手动交割，点击提金按钮
     *
     * @return delivery_type - 交割提金类型，0 自动交割（强制平仓和自动平仓的订单），1 手动交割，点击提金按钮
     */
    public Short getDeliveryType() {
        return deliveryType;
    }

    /**
     * 设置交割提金类型，0 自动交割（强制平仓和自动平仓的订单），1 手动交割，点击提金按钮
     *
     * @param deliveryType 交割提金类型，0 自动交割（强制平仓和自动平仓的订单），1 手动交割，点击提金按钮
     */
    public void setDeliveryType(Short deliveryType) {
        this.deliveryType = deliveryType;
    }

    /**
     * 获取订单状态（0未支付、1已支付、2已发货、已完成、作废）
     *
     * @return order_state - 订单状态（0未支付、1已支付、2已发货、已完成、作废）
     */
    public Short getOrderState() {
        return orderState;
    }

    /**
     * 设置订单状态（0未支付、1已支付、2已发货、已完成、作废）
     *
     * @param orderState 订单状态（0未支付、1已支付、2已发货、已完成、作废）
     */
    public void setOrderState(Short orderState) {
        this.orderState = orderState;
    }

    /**
     * 获取0预购订单、1商城订单、2金权交易的提金订单
     *
     * @return order_type - 0预购订单、1商城订单、2金权交易的提金订单
     */
    public Short getOrderType() {
        return orderType;
    }

    /**
     * 设置0预购订单、1商城订单、2金权交易的提金订单
     *
     * @param orderType 0预购订单、1商城订单、2金权交易的提金订单
     */
    public void setOrderType(Short orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取创建时间或者提金时间
     *
     * @return create_time - 创建时间或者提金时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间或者提金时间
     *
     * @param createTime 创建时间或者提金时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取支付时间
     *
     * @return pay_time - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取发货时间
     *
     * @return send_time - 发货时间
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 设置发货时间
     *
     * @param sendTime 发货时间
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 获取完成或者作废时间
     *
     * @return complete_time - 完成或者作废时间
     */
    public Date getCompleteTime() {
        return completeTime;
    }

    /**
     * 设置完成或者作废时间
     *
     * @param completeTime 完成或者作废时间
     */
    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    /**
     * 获取订单配置信息，金权交易提金订单配置信息、预购配置信息、商城配置信息
     *
     * @return conf - 订单配置信息，金权交易提金订单配置信息、预购配置信息、商城配置信息
     */
    public String getConf() {
        return conf;
    }

    /**
     * 设置订单配置信息，金权交易提金订单配置信息、预购配置信息、商城配置信息
     *
     * @param conf 订单配置信息，金权交易提金订单配置信息、预购配置信息、商城配置信息
     */
    public void setConf(String conf) {
        this.conf = conf;
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