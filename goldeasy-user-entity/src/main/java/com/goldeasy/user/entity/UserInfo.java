package com.goldeasy.user.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "user_info")
public class UserInfo {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户状态1：正常，0：禁用
     */
    @Column(name = "user_status")
    private Short userStatus;

    @Column(name = "user_nick_name")
    private String userNickName;

    /**
     * 用户头像
     */
    @Column(name = "user_head_image")
    private String userHeadImage;

    /**
     * 真实名字
     */
    @Column(name = "user_real_name")
    private String userRealName;

    /**
     * 身份证号
     */
    @Column(name = "user_ID_card")
    private String userIdCard;

    /**
     * 身份证图片
     */
    @Column(name = "user_ID_card_positive")
    private String userIdCardPositive;

    /**
     * 身份证背面图片
     */
    @Column(name = "user_ID_card_back")
    private String userIdCardBack;

    /**
     * 0：未知；1：男；2：女
     */
    @Column(name = "user_sex")
    private Short userSex;

    /**
     * 实名认证申请时间
     */
    @Column(name = "real_name_auth_apply_time")
    private Date realNameAuthApplyTime;

    /**
     * 实名认证审核时间
     */
    @Column(name = "real_name_auth_examine_time")
    private Date realNameAuthExamineTime;

    /**
     * 实名认证状态1：未实名，2：审核中，3：审核通过，4：审核未通过
     */
    @Column(name = "real_name_auth_status")
    private Short realNameAuthStatus;

    /**
     * 注册时间
     */
    @Column(name = "register_time")
    private Date registerTime;

    /**
     * 注册来源:Android，iOS
     */
    @Column(name = "register_from")
    private String registerFrom;

    /**
     * 注册IP
     */
    @Column(name = "register_ip")
    private String registerIp;

    /**
     * 登陆时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * 登陆设备:Android，iOS
     */
    @Column(name = "login_from")
    private String loginFrom;

    /**
     * 登陆IP
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 手机号归属地，市
     */
    @Column(name = "phone_attribution_city")
    private String phoneAttributionCity;

    /**
     * 手机号归属地，省
     */
    @Column(name = "phone_attribution_province")
    private String phoneAttributionProvince;

    /**
     * 总经理id
     */
    @Column(name = "general_manager_id")
    private Long generalManagerId;

    /**
     * 市场总监id
     */
    @Column(name = "marketing_director_id")
    private Long marketingDirectorId;

    /**
     * 经理id
     */
    @Column(name = "manager_id")
    private Long managerId;

    /**
     * 主管id
     */
    @Column(name = "director_id")
    private Long directorId;

    /**
     * 经纪人id
     */
    @Column(name = "broker_id")
    private Long brokerId;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户状态1：正常，0：禁用
     *
     * @return user_status - 用户状态1：正常，0：禁用
     */
    public Short getUserStatus() {
        return userStatus;
    }

    /**
     * 设置用户状态1：正常，0：禁用
     *
     * @param userStatus 用户状态1：正常，0：禁用
     */
    public void setUserStatus(Short userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * @return user_nick_name
     */
    public String getUserNickName() {
        return userNickName;
    }

    /**
     * @param userNickName
     */
    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    /**
     * 获取用户头像
     *
     * @return user_head_image - 用户头像
     */
    public String getUserHeadImage() {
        return userHeadImage;
    }

    /**
     * 设置用户头像
     *
     * @param userHeadImage 用户头像
     */
    public void setUserHeadImage(String userHeadImage) {
        this.userHeadImage = userHeadImage;
    }

    /**
     * 获取真实名字
     *
     * @return user_real_name - 真实名字
     */
    public String getUserRealName() {
        return userRealName;
    }

    /**
     * 设置真实名字
     *
     * @param userRealName 真实名字
     */
    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    /**
     * 获取身份证号
     *
     * @return user_ID_card - 身份证号
     */
    public String getUserIdCard() {
        return userIdCard;
    }

    /**
     * 设置身份证号
     *
     * @param userIdCard 身份证号
     */
    public void setUserIdCard(String userIdCard) {
        this.userIdCard = userIdCard;
    }

    /**
     * 获取身份证图片
     *
     * @return user_ID_card_positive - 身份证图片
     */
    public String getUserIdCardPositive() {
        return userIdCardPositive;
    }

    /**
     * 设置身份证图片
     *
     * @param userIdCardPositive 身份证图片
     */
    public void setUserIdCardPositive(String userIdCardPositive) {
        this.userIdCardPositive = userIdCardPositive;
    }

    /**
     * 获取身份证背面图片
     *
     * @return user_ID_card_back - 身份证背面图片
     */
    public String getUserIdCardBack() {
        return userIdCardBack;
    }

    /**
     * 设置身份证背面图片
     *
     * @param userIdCardBack 身份证背面图片
     */
    public void setUserIdCardBack(String userIdCardBack) {
        this.userIdCardBack = userIdCardBack;
    }

    /**
     * 获取0：未知；1：男；2：女
     *
     * @return user_sex - 0：未知；1：男；2：女
     */
    public Short getUserSex() {
        return userSex;
    }

    /**
     * 设置0：未知；1：男；2：女
     *
     * @param userSex 0：未知；1：男；2：女
     */
    public void setUserSex(Short userSex) {
        this.userSex = userSex;
    }

    /**
     * 获取实名认证申请时间
     *
     * @return real_name_auth_apply_time - 实名认证申请时间
     */
    public Date getRealNameAuthApplyTime() {
        return realNameAuthApplyTime;
    }

    /**
     * 设置实名认证申请时间
     *
     * @param realNameAuthApplyTime 实名认证申请时间
     */
    public void setRealNameAuthApplyTime(Date realNameAuthApplyTime) {
        this.realNameAuthApplyTime = realNameAuthApplyTime;
    }

    /**
     * 获取实名认证审核时间
     *
     * @return real_name_auth_examine_time - 实名认证审核时间
     */
    public Date getRealNameAuthExamineTime() {
        return realNameAuthExamineTime;
    }

    /**
     * 设置实名认证审核时间
     *
     * @param realNameAuthExamineTime 实名认证审核时间
     */
    public void setRealNameAuthExamineTime(Date realNameAuthExamineTime) {
        this.realNameAuthExamineTime = realNameAuthExamineTime;
    }

    /**
     * 获取实名认证状态1：未实名，2：审核中，3：审核通过，4：审核未通过
     *
     * @return real_name_auth_status - 实名认证状态1：未实名，2：审核中，3：审核通过，4：审核未通过
     */
    public Short getRealNameAuthStatus() {
        return realNameAuthStatus;
    }

    /**
     * 设置实名认证状态1：未实名，2：审核中，3：审核通过，4：审核未通过
     *
     * @param realNameAuthStatus 实名认证状态1：未实名，2：审核中，3：审核通过，4：审核未通过
     */
    public void setRealNameAuthStatus(Short realNameAuthStatus) {
        this.realNameAuthStatus = realNameAuthStatus;
    }

    /**
     * 获取注册时间
     *
     * @return register_time - 注册时间
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 设置注册时间
     *
     * @param registerTime 注册时间
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * 获取注册来源:Android，iOS
     *
     * @return register_from - 注册来源:Android，iOS
     */
    public String getRegisterFrom() {
        return registerFrom;
    }

    /**
     * 设置注册来源:Android，iOS
     *
     * @param registerFrom 注册来源:Android，iOS
     */
    public void setRegisterFrom(String registerFrom) {
        this.registerFrom = registerFrom;
    }

    /**
     * 获取注册IP
     *
     * @return register_ip - 注册IP
     */
    public String getRegisterIp() {
        return registerIp;
    }

    /**
     * 设置注册IP
     *
     * @param registerIp 注册IP
     */
    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    /**
     * 获取登陆时间
     *
     * @return login_time - 登陆时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登陆时间
     *
     * @param loginTime 登陆时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取登陆设备:Android，iOS
     *
     * @return login_from - 登陆设备:Android，iOS
     */
    public String getLoginFrom() {
        return loginFrom;
    }

    /**
     * 设置登陆设备:Android，iOS
     *
     * @param loginFrom 登陆设备:Android，iOS
     */
    public void setLoginFrom(String loginFrom) {
        this.loginFrom = loginFrom;
    }

    /**
     * 获取登陆IP
     *
     * @return login_ip - 登陆IP
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置登陆IP
     *
     * @param loginIp 登陆IP
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * 获取手机号归属地，市
     *
     * @return phone_attribution_city - 手机号归属地，市
     */
    public String getPhoneAttributionCity() {
        return phoneAttributionCity;
    }

    /**
     * 设置手机号归属地，市
     *
     * @param phoneAttributionCity 手机号归属地，市
     */
    public void setPhoneAttributionCity(String phoneAttributionCity) {
        this.phoneAttributionCity = phoneAttributionCity;
    }

    /**
     * 获取手机号归属地，省
     *
     * @return phone_attribution_province - 手机号归属地，省
     */
    public String getPhoneAttributionProvince() {
        return phoneAttributionProvince;
    }

    /**
     * 设置手机号归属地，省
     *
     * @param phoneAttributionProvince 手机号归属地，省
     */
    public void setPhoneAttributionProvince(String phoneAttributionProvince) {
        this.phoneAttributionProvince = phoneAttributionProvince;
    }

    /**
     * 获取总经理id
     *
     * @return general_manager_id - 总经理id
     */
    public Long getGeneralManagerId() {
        return generalManagerId;
    }

    /**
     * 设置总经理id
     *
     * @param generalManagerId 总经理id
     */
    public void setGeneralManagerId(Long generalManagerId) {
        this.generalManagerId = generalManagerId;
    }

    /**
     * 获取市场总监id
     *
     * @return marketing_director_id - 市场总监id
     */
    public Long getMarketingDirectorId() {
        return marketingDirectorId;
    }

    /**
     * 设置市场总监id
     *
     * @param marketingDirectorId 市场总监id
     */
    public void setMarketingDirectorId(Long marketingDirectorId) {
        this.marketingDirectorId = marketingDirectorId;
    }

    /**
     * 获取经理id
     *
     * @return manager_id - 经理id
     */
    public Long getManagerId() {
        return managerId;
    }

    /**
     * 设置经理id
     *
     * @param managerId 经理id
     */
    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    /**
     * 获取主管id
     *
     * @return director_id - 主管id
     */
    public Long getDirectorId() {
        return directorId;
    }

    /**
     * 设置主管id
     *
     * @param directorId 主管id
     */
    public void setDirectorId(Long directorId) {
        this.directorId = directorId;
    }

    /**
     * 获取经纪人id
     *
     * @return broker_id - 经纪人id
     */
    public Long getBrokerId() {
        return brokerId;
    }

    /**
     * 设置经纪人id
     *
     * @param brokerId 经纪人id
     */
    public void setBrokerId(Long brokerId) {
        this.brokerId = brokerId;
    }
}