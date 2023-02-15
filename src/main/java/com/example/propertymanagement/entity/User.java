package com.example.propertymanagement.entity;

public class User {
    private Integer userid;

    private String username;

    private String userpassword;

    private Integer userbalance;

    private String userrealname;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public Integer getUserbalance() {
        return userbalance;
    }

    public void setUserbalance(Integer userbalance) {
        this.userbalance = userbalance;
    }

    public String getUserrealname() {
        return userrealname;
    }

    public void setUserrealname(String userrealname) {
        this.userrealname = userrealname == null ? null : userrealname.trim();
    }
}