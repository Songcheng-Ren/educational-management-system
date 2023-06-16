package com.scu.springboot.demo.vo;

import com.scu.springboot.demo.entity.Takes;

public class Student_listVo extends Takes {
    private String name;

    private String deptName;

    private String home;


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


    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
