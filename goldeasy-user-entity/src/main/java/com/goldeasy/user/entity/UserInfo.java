package com.goldeasy.user.entity;

public class UserInfo {
    private Long id;

    private String phone;

    private String userName;

    private String password;

    private String userNickName;

    private String userRealName;

    private Short userState;

    private Short authState;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName == null ? null : userNickName.trim();
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    public Short getUserState() {
        return userState;
    }

    public void setUserState(Short userState) {
        this.userState = userState;
    }

    public Short getAuthState() {
        return authState;
    }

    public void setAuthState(Short authState) {
        this.authState = authState;
    }
}