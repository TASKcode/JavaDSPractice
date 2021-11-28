package com.code.demo.playgorund.model;

import javax.persistence.Entity;

@Entity
public class User {
    private Long userId;
    private String userName;
    private String encryptedPassword;

    public Long getUserId() {
        return userId;
    }

    public User setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public User setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
        return this;
    }

    public User(Long userId, String userName, String encryptedPassword) {
        this.userId = userId;
        this.userName = userName;
        this.encryptedPassword = encryptedPassword;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", encryptedPassword='" + encryptedPassword + '\'' +
                '}';
    }
}
