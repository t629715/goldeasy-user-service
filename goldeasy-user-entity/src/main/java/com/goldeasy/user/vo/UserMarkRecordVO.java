package com.goldeasy.user.vo;

import java.io.Serializable;

/**
 * @author: adminisrator
 * @date: 2018/11/19
 * @description:
 */
public class UserMarkRecordVO implements Serializable {
    /**
     * 创建时间
     */
    private String gmtCreate;
    /**
     * 变更原因
     */
    private String alterReason;
    /**
     * 变更积分
     */
    private String mark;

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getAlterReason() {
        return alterReason;
    }

    public void setAlterReason(String alterReason) {
        this.alterReason = alterReason;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "UserMarkRecordVO{" +
                "gmtCreate='" + gmtCreate + '\'' +
                ", alterReason='" + alterReason + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
