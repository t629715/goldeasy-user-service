package com.goldeasy.user.vo;

import java.io.Serializable;
import java.util.Date;

public class UserMessageInfoVO implements Serializable {


    /**
     * 消息标题
     */
    private String msgTitle;

    /**
     * 消息内容
     */
    private String msgContent;

    /**
     * 创建时间
     */
    private Date gmtCreate;


    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
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

    @Override
    public String toString() {
        return "UserMessageInfoVO{" +
                "msgTitle='" + msgTitle + '\'' +
                ", msgContent='" + msgContent + '\'' +
                '}';
    }
}