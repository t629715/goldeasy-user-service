package com.goldeasy.user.vo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "user_invoice_info")
public class UserInvoiceInfoVO implements Serializable {
    /**
     * 发票ID
     */
    private Long id;

    /**
     * 发票抬头
     */

    private String invoiceTitle;

    /**
     * 发票类型-1：个人，2：公司
     */
    private Short invoiceType;

    /**
     * 接收电子发票邮箱
     */
    private String invoiceReceiveMail;

    /**
     * 税务号：发票类型为公司时填入
     */
    private String invoiceTaxNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public Short getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Short invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceReceiveMail() {
        return invoiceReceiveMail;
    }

    public void setInvoiceReceiveMail(String invoiceReceiveMail) {
        this.invoiceReceiveMail = invoiceReceiveMail;
    }

    public String getInvoiceTaxNum() {
        return invoiceTaxNum;
    }

    public void setInvoiceTaxNum(String invoiceTaxNum) {
        this.invoiceTaxNum = invoiceTaxNum;
    }

    @Override
    public String toString() {
        return "UserInvoiceInfoVO{" +
                "id=" + id +
                ", invoiceTitle='" + invoiceTitle + '\'' +
                ", invoiceType=" + invoiceType +
                ", invoiceReceiveMail='" + invoiceReceiveMail + '\'' +
                ", invoiceTaxNum='" + invoiceTaxNum + '\'' +
                '}';
    }
}