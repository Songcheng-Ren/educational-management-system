package com.scu.springboot.demo.entity;

import java.io.Serializable;

/**
 * (Instructor)实体类
 *
 * @author makejava
 * @since 2022-07-17 15:03:49
 */
public class Instructor implements Serializable {
    private static final long serialVersionUID = 432201820833857268L;
    
    private String tid;
    
    private String name;
    
    private String deptName;
    
    private Double salary;
    
    private String password;
    
    private String phone;
    
    private String politicalOutlook;
    
    private String title;
    
    private String category;
    
    private String organization;


    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPoliticalOutlook() {
        return politicalOutlook;
    }

    public void setPoliticalOutlook(String politicalOutlook) {
        this.politicalOutlook = politicalOutlook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }



}

