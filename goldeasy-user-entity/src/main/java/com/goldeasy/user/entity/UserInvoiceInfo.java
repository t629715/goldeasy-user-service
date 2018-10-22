package com.goldeasy.user.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "user_invoice_info")
public class UserInvoiceInfo {
    /**
     * 发票ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 发票抬头
     */
    @Column(name = "invoice_title")
    private String invoiceTitle;

    /**
     * 发票类型-1：个人，2：公司
     */
    @Column(name = "invoice_type")
    private Short invoiceType;

    /**
     * 接收电子发票邮箱
     */
    @Column(name = "invoice_receive_mail")
    private String invoiceReceiveMail;

    /**
     * 税务号：发票类型为公司时填入
     */
    @Column(name = "invoice_tax_num")
    private String invoiceTaxNum;

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
     * 获取发票ID
     *
     * @return id - 发票ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置发票ID
     *
     * @param id 发票ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取发票抬头
     *
     * @return invoice_title - 发票抬头
     */
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    /**
     * 设置发票抬头
     *
     * @param invoiceTitle 发票抬头
     */
    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    /**
     * 获取发票类型-1：个人，2：公司
     *
     * @return invoice_type - 发票类型-1：个人，2：公司
     */
    public Short getInvoiceType() {
        return invoiceType;
    }

    /**
     * 设置发票类型-1：个人，2：公司
     *
     * @param invoiceType 发票类型-1：个人，2：公司
     */
    public void setInvoiceType(Short invoiceType) {
        this.invoiceType = invoiceType;
    }

    /**
     * 获取接收电子发票邮箱
     *
     * @return invoice_receive_mail - 接收电子发票邮箱
     */
    public String getInvoiceReceiveMail() {
        return invoiceReceiveMail;
    }

    /**
     * 设置接收电子发票邮箱
     *
     * @param invoiceReceiveMail 接收电子发票邮箱
     */
    public void setInvoiceReceiveMail(String invoiceReceiveMail) {
        this.invoiceReceiveMail = invoiceReceiveMail;
    }

    /**
     * 获取税务号：发票类型为公司时填入
     *
     * @return invoice_tax_num - 税务号：发票类型为公司时填入
     */
    public String getInvoiceTaxNum() {
        return invoiceTaxNum;
    }

    /**
     * 设置税务号：发票类型为公司时填入
     *
     * @param invoiceTaxNum 税务号：发票类型为公司时填入
     */
    public void setInvoiceTaxNum(String invoiceTaxNum) {
        this.invoiceTaxNum = invoiceTaxNum;
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