package com.scu.springboot.demo.entity;

import java.io.Serializable;

/**
 * (College)实体类
 *
 * @author makejava
 * @since 2022-07-20 01:09:14
 */
public class College implements Serializable {
    private static final long serialVersionUID = 567945082120580670L;
    
    private String college;
    
    private String major;
    
    private String introduction;


    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

}

