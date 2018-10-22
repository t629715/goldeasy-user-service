package com.goldeasy.user.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "user_message")
public class UserMessage {
    /**
     * 消息ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 消息标题
     */
    @Column(name = "msg_title")
    private String msgTitle;

    /**
     * 消息内容
     */
    @Column(name = "msg_content")
    private String msgContent;

    /**
     * 消息阅读状态-0：未读，1：已读
     */
    @Column(name = "read_or_not")
    private Boolean readOrNot;

    /**
     * 消息类型-1：系统消息，2：其他消息
     */
    @Column(name = "msg_type")
    private Short msgType;

    /**
     * 消息类型-0:不跳转
     */
    @Column(name = "skip_to")
    private Short skipTo;

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
     * 获取消息ID
     *
     * @return id - 消息ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置消息ID
     *
     * @param id 消息ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取消息标题
     *
     * @return msg_title - 消息标题
     */
    public String getMsgTitle() {
        return msgTitle;
    }

    /**
     * 设置消息标题
     *
     * @param msgTitle 消息标题
     */
    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    /**
     * 获取消息内容
     *
     * @return msg_content - 消息内容
     */
    public String getMsgContent() {
        return msgContent;
    }

    /**
     * 设置消息内容
     *
     * @param msgContent 消息内容
     */
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    /**
     * 获取消息阅读状态-0：未读，1：已读
     *
     * @return read_or_not - 消息阅读状态-0：未读，1：已读
     */
    public Boolean getReadOrNot() {
        return readOrNot;
    }

    /**
     * 设置消息阅读状态-0：未读，1：已读
     *
     * @param readOrNot 消息阅读状态-0：未读，1：已读
     */
    public void setReadOrNot(Boolean readOrNot) {
        this.readOrNot = readOrNot;
    }

    /**
     * 获取消息类型-1：系统消息，2：其他消息
     *
     * @return msg_type - 消息类型-1：系统消息，2：其他消息
     */
    public Short getMsgType() {
        return msgType;
    }

    /**
     * 设置消息类型-1：系统消息，2：其他消息
     *
     * @param msgType 消息类型-1：系统消息，2：其他消息
     */
    public void setMsgType(Short msgType) {
        this.msgType = msgType;
    }

    /**
     * 获取消息类型-0:不跳转
     *
     * @return skip_to - 消息类型-0:不跳转
     */
    public Short getSkipTo() {
        return skipTo;
    }

    /**
     * 设置消息类型-0:不跳转
     *
     * @param skipTo 消息类型-0:不跳转
     */
    public void setSkipTo(Short skipTo) {
        this.skipTo = skipTo;
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