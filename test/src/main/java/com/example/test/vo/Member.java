package com.example.test.vo;

import java.util.Date;

public class Member {

    private String userId;
    private String userPass;
    private String userName;
    private String Company;
    private Date regDate;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserPass() {
        return userPass;
    }
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getCompany() { return Company; }
    public void setCompany(String company) { Company = company; }
    public Date getRegDate() { return regDate; }
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userId='" + userId + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userName='" + userName + '\'' +
                ", Company='" + Company + '\'' +
                ", regDate=" + regDate +
                '}';
    }
}
