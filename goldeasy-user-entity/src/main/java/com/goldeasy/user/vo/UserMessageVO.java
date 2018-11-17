package com.goldeasy.user.vo;

import java.io.Serializable;
import java.util.Date;

public class UserMessageVO implements Serializable {
    /**
     * 消息ID
     */
    private Long id;


    /**
     * 消息标题
     */
    private String msgTitle;
    /**
     * 消息内容
     */
    private String msgContent;

    /**
     * 消息阅读状态-0：未读，1：已读
     */
    private Boolean readOrNot;

    /**
     * 消息类型-1：系统消息，2：其他消息
     */
    private Short msgType;

    /**
     * 消息类型-0:不跳转
     */
    private Short skipTo;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public Boolean getReadOrNot() {
        return readOrNot;
    }

    public void setReadOrNot(Boolean readOrNot) {
        this.readOrNot = readOrNot;
    }

    public Short getMsgType() {
        return msgType;
    }

    public void setMsgType(Short msgType) {
        this.msgType = msgType;
    }

    public Short getSkipTo() {
        return skipTo;
    }

    public void setSkipTo(Short skipTo) {
        this.skipTo = skipTo;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }


    @Override
    public String toString() {
        return "UserMessageVO{" +
                "id=" + id +
                ", msgTitle='" + msgTitle + '\'' +
                ", msgContent='" + msgContent + '\'' +
                ", readOrNot=" + readOrNot +
                ", msgType=" + msgType +
                ", skipTo=" + skipTo +
                ", gmtCreate=" + gmtCreate +
                '}';
    }
}