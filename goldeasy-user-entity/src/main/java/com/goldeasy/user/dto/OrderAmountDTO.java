package com.goldeasy.user.dto;

import java.io.Serializable;

/**
 * @author: tianliya
 * @date: 2018/10/24
 * @description: 订单数量传递类
 */
public class OrderAmountDTO implements Serializable {

    private static final long serialVersionUID = -5303966376945070598L;
    /**
     * 我的订单-已支付订单数量
     */
    private Integer alreadyPaidAmount;

    /**
     * 我的订单-已完成订单数量
     */
    private Integer completedAmount;

    /**
     * 我的订单-待收获订单数量
     */
    private Integer waitReceiveAmount;
    /**
     * 预约订单数量
     */
    private Integer preAmount;

    public Integer getAlreadyPaidAmount() {
        return alreadyPaidAmount;
    }

    public void setAlreadyPaidAmount(Integer alreadyPaidAmount) {
        this.alreadyPaidAmount = alreadyPaidAmount;
    }

    public Integer getCompletedAmount() {
        return completedAmount;
    }

    public void setCompletedAmount(Integer completedAmount) {
        this.completedAmount = completedAmount;
    }

    public Integer getWaitReceiveAmount() {
        return waitReceiveAmount;
    }

    public void setWaitReceiveAmount(Integer waitReceiveAmount) {
        this.waitReceiveAmount = waitReceiveAmount;
    }

    public Integer getPreAmount() {
        return preAmount;
    }

    public void setPreAmount(Integer preAmount) {
        this.preAmount = preAmount;
    }

    @Override
    public String toString() {
        return "OrderAmountDTO{" +
                "alreadyPaidAmount=" + alreadyPaidAmount +
                ", completedAmount=" + completedAmount +
                ", waitReceiveAmount=" + waitReceiveAmount +
                ", preAmount=" + preAmount +
                '}';
    }
}
