package com.goldeasy.user.vo;

/**
 * @author: tianliya
 * @date: 2018/10/22
 * @description:
 */
public class UserInfoVO  {
    /**
     * 手机号
     */
    public String phone;
    /**
     * 密码
     */
    public String password;
    /**
     * 总经理id
     */
    public Long generalManagerId;
    /**
     * 市场总监id
     */
    public Long marketingDirectorId;
    /**
     * 经理id
     */
    public Long managerId;
    /**
     * 主管id
     */
    public Long directorId;
    /**
     * 经纪人id
     */
    public Long brokerId;

    public String registerIp;
    public String registerDevice;



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
        return "UserInfoVO{" +
                "phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", generalManagerId=" + generalManagerId +
                ", marketingDirectorId=" + marketingDirectorId +
                ", managerId=" + managerId +
                ", directorId=" + directorId +
                ", brokerId=" + brokerId +
                ", registerIp='" + registerIp + '\'' +
                ", registerDevice='" + registerDevice + '\'' +
                '}';
    }

}
