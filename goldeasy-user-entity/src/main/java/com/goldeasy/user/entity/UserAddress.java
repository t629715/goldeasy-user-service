package com.goldeasy.user.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "user_address")
public class UserAddress {
    /**
     * id
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
     * 联系人
     */
    @Column(name = "contact_name")
    private String contactName;

    /**
     * 联系电话
     */
    @Column(name = "contact_phone")
    private String contactPhone;

    /**
     * 地址-省
     */
    @Column(name = "address_province")
    private String addressProvince;

    /**
     * 地址-市
     */
    @Column(name = "address_city")
    private String addressCity;

    /**
     * 地址-县（区）
     */
    @Column(name = "address_county")
    private String addressCounty;

    /**
     * 地址-详情
     */
    @Column(name = "address_info")
    private String addressInfo;

    /**
     * 地址-省+市+县+详情
     */
    @Column(name = "receive_address")
    private String receiveAddress;

    /**
     * 是否是默认地址，0 不是；1是
     */
    @Column(name = "is_default")
    private Short isDefault;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
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
     * 获取联系人
     *
     * @return contact_name - 联系人
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置联系人
     *
     * @param contactName 联系人
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * 获取联系电话
     *
     * @return contact_phone - 联系电话
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 设置联系电话
     *
     * @param contactPhone 联系电话
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * 获取地址-省
     *
     * @return address_province - 地址-省
     */
    public String getAddressProvince() {
        return addressProvince;
    }

    /**
     * 设置地址-省
     *
     * @param addressProvince 地址-省
     */
    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince;
    }

    /**
     * 获取地址-市
     *
     * @return address_city - 地址-市
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * 设置地址-市
     *
     * @param addressCity 地址-市
     */
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    /**
     * 获取地址-县（区）
     *
     * @return address_conuty - 地址-县（区）
     */
    public String getAddressCounty() {
        return addressCounty;
    }

    /**
     * 设置地址-县（区）
     *
     * @param addressConuty 地址-县（区）
     */
    public void setAddressCounty(String addressConuty) {
        this.addressCounty = addressConuty;
    }

    /**
     * 获取地址-详情
     *
     * @return address_info - 地址-详情
     */
    public String getAddressInfo() {
        return addressInfo;
    }

    /**
     * 设置地址-详情
     *
     * @param addressInfo 地址-详情
     */
    public void setAddressInfo(String addressInfo) {
        this.addressInfo = addressInfo;
    }

    /**
     * 获取地址-省+市+县+详情
     *
     * @return receive_address - 地址-省+市+县+详情
     */
    public String getReceiveAddress() {
        return receiveAddress;
    }

    /**
     * 设置地址-省+市+县+详情
     *
     * @param receiveAddress 地址-省+市+县+详情
     */
    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    /**
     * 获取是否是默认地址，0 不是；1是
     *
     * @return is_default - 是否是默认地址，0 不是；1是
     */
    public Short getIsDefault() {
        return isDefault;
    }

    /**
     * 设置是否是默认地址，0 不是；1是
     *
     * @param isDefault 是否是默认地址，0 不是；1是
     */
    public void setIsDefault(Short isDefault) {
        this.isDefault = isDefault;
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
}