package com.goldeasy.user.vo;

import java.io.Serializable;

/**
 * @author: tianliya
 * @date: 2018/11/9
 * @description: 用于页面展示的地址信息
 */
public class UserAddressVO implements Serializable {

    private static final long serialVersionUID = 7158360965524549652L;
    /**
     * 地址表id
     */
    private Long id;
    /**
     * 联系人
     */
    private String contactName;
    /**
     * 联系电话
     */
    private String contactPhone;
    /**
     * 省
     */
    private String addressProvince;
    /**
     * 市
     */
    private String addressCity;
    /**
     * 县、区
     */
    private String addressCounty;
    /**
     * 地址详情
     */
    private String addressInfo;
    /**
     * 省+市+县/区+详情
     */
    private String receiveAddress;
    /**
     * 是否为默认地址 0：不是，1：是
     */
    private Short isDefault;

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Short getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Short isDefault) {
        this.isDefault = isDefault;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressProvince() {
        return addressProvince;
    }

    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressCounty() {
        return addressCounty;
    }

    public void setAddressCounty(String addressCounty) {
        this.addressCounty = addressCounty;
    }

    public String getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(String addressInfo) {
        this.addressInfo = addressInfo;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    @Override
    public String toString() {
        return "UserAddressVO{" +
                "id=" + id +
                ", contactName='" + contactName + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", addressProvince='" + addressProvince + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", addressCounty='" + addressCounty + '\'' +
                ", addressInfo='" + addressInfo + '\'' +
                ", receiveAddress='" + receiveAddress + '\'' +
                '}';
    }
}
