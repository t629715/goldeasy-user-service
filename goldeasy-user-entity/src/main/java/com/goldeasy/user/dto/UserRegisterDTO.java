package com.goldeasy.user.dto;

import java.io.Serializable;

/**
 * @author: tianliya
 * @date: 2018/10/23
 * @description: 用户注册传递参数
 */
public class UserRegisterDTO implements Serializable {

    private static final long serialVersionUID = 3847274694230811374L;
    /**
     * 用户手机号
     */
    private String phone;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 总经理id
     */
    private Long generalManagerId;
    /**
     * 市场总监id
     */
    private Long marketingDirectorId;
    /**
     * 经理id
     */
    private Long managerId;
    /**
     * 主管id
     */
    private Long directorId;
    /**
     * 经纪人id
     */
    private Long brokerId;

    private String registerIp;
    private String registerDevice;

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public String getRegisterDevice() {
        return registerDevice;
    }

    public void setRegisterDevice(String registerDevice) {
        this.registerDevice = registerDevice;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getGeneralManagerId() {
        return generalManagerId;
    }

    public void setGeneralManagerId(Long generalManagerId) {
        this.generalManagerId = generalManagerId;
    }

    public Long getMarketingDirectorId() {
        return marketingDirectorId;
    }

    public void setMarketingDirectorId(Long marketingDirectorId) {
        this.marketingDirectorId = marketingDirectorId;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public Long getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Long directorId) {
        this.directorId = directorId;
    }

    public Long getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(Long brokerId) {
        this.brokerId = brokerId;
    }

    @Override
    public String toString() {
        return "UserRegisterDTO{" +
                "phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", generalManagerId=" + generalManagerId +
                ", marketingDirectorId=" + marketingDirectorId +
                ", managerId=" + managerId +
                ", directorId=" + directorId +
                ", brokerId=" + brokerId +
                '}';
    }
}
