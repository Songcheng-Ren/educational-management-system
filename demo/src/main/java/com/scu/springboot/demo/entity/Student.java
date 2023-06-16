package com.scu.springboot.demo.entity;

import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2022-07-19 10:31:22
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 468741980775926222L;
    
    private String sid;
    
    private String name;
    
    private String deptName;
    
    private Integer totCred;
    
    private String password;
    
    private String phoneNumber;
    
    private String home;
    
    private String enter;


    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getTotCred() {
        return totCred;
    }

    public void setTotCred(Integer totCred) {
        this.totCred = totCred;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getEnter() {
        return enter;
    }

    public void setEnter(String enter) {
        this.enter = enter;
    }

}

