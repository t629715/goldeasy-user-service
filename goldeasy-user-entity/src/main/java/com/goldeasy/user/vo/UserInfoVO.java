package com.goldeasy.user.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author: tianliya
 * @date: 2018/10/23
 * @description: 用户页面展示的用户信息类
 */
public class UserInfoVO implements Serializable {

    private static final long serialVersionUID = -6111734094884630834L;
    /**
     * 用户头像
     */
    private String userHeadImage;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户昵称
     */
    private String userNickName;
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
     * 是否有维度消息
     */
    private Integer unReadAmount;
    /**
     * 积分余额
     */
    private BigDecimal markAmount;
    /**
     * 卡券数量
     */
    private Integer voucherAmount;
    /**
     * 预约数量
     */
    private Integer preAmount;

    public Integer getUnReadAmount() {
        return unReadAmount;
    }

    public void setUnReadAmount(Integer unReadAmount) {
        this.unReadAmount = unReadAmount;
    }

    public BigDecimal getMarkAmount() {
        return markAmount;
    }

    public void setMarkAmount(BigDecimal markAmount) {
        this.markAmount = markAmount;
    }

    public Integer getVoucherAmount() {
        return voucherAmount;
    }

    public void setVoucherAmount(Integer voucherAmount) {
        this.voucherAmount = voucherAmount;
    }

    public Integer getPreAmount() {
        return preAmount;
    }

    public void setPreAmount(Integer preAmount) {
        this.preAmount = preAmount;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserHeadImage() {
        return userHeadImage;
    }

    public void setUserHeadImage(String userHeadImage) {
        this.userHeadImage = userHeadImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

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

    @Override
    public String toString() {
        return "UserInfoVO{" +
                "userHeadImage='" + userHeadImage + '\'' +
                ", userName='" + userName + '\'' +
                ", userNickName='" + userNickName + '\'' +
                ", alreadyPaidAmount=" + alreadyPaidAmount +
                ", completedAmount=" + completedAmount +
                ", waitReceiveAmount=" + waitReceiveAmount +
                ", unReadAmount=" + unReadAmount +
                ", markAmount=" + markAmount +
                ", voucherAmount=" + voucherAmount +
                ", preAmount=" + preAmount +
                '}';
    }
}
