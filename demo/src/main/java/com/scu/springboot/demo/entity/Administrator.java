package com.scu.springboot.demo.entity;

import java.io.Serializable;

/**
 * (Administrator)实体类
 *
 * @author makejava
 * @since 2022-07-19 15:43:30
 */
public class Administrator implements Serializable {
    private static final long serialVersionUID = -33182557439349752L;
    
    private String adminid;
    
    private String password;
    
    private String department;


    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}

