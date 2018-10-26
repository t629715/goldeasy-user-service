package com.goldeasy.user.vo;

import java.io.Serializable;

/**
 * @author: tianliya
 * @date: 2018/10/26
 * @description: 用于用户支付宝界面展示
 */
public class UserAlipayVO implements Serializable {

    private static final long serialVersionUID = -3787762647621015118L;
    /**
     * 支付宝id
     */
    private Long id;
    /**
     * 用户支付宝账号
     */
    private String aliPayNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAliPayNum() {
        return aliPayNum;
    }

    public void setAliPayNum(String aliPayNum) {
        this.aliPayNum = aliPayNum;
    }

    @Override
    public String toString() {
        return "UserAlipayVO{" +
                "id=" + id +
                ", aliPayNum='" + aliPayNum + '\'' +
                '}';
    }
}
