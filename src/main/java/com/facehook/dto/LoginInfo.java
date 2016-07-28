package com.facehook.dto;

/**
 * Created by Break.D on 7/25/16.
 */
public class LoginInfo {
    private String email;
    private String pwd;
    private String remember;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRemember() {
        return remember;
    }

    public void setRemember(String remember) {
        this.remember = remember;
    }
}
