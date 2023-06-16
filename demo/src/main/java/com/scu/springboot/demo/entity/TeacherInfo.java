package com.scu.springboot.demo.entity;

import java.io.Serializable;

/**
 * (TeacherInfo)实体类
 *
 * @author makejava
 * @since 2022-07-17 19:59:01
 */
public class TeacherInfo implements Serializable {
    private static final long serialVersionUID = 689566957390431426L;
    
    private String tid;
    
    private String teacherName;
    
    private String teacherDepartment;
    
    private String teacherPhone;
    
    private String teacherPoliticalOutlook;
    
    private String teacherTitle;
    
    private String teacherCategory;
    
    private String teacherOrganization;


    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherDepartment() {
        return teacherDepartment;
    }

    public void setTeacherDepartment(String teacherDepartment) {
        this.teacherDepartment = teacherDepartment;
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    public String getTeacherPoliticalOutlook() {
        return teacherPoliticalOutlook;
    }

    public void setTeacherPoliticalOutlook(String teacherPoliticalOutlook) {
        this.teacherPoliticalOutlook = teacherPoliticalOutlook;
    }

    public String getTeacherTitle() {
        return teacherTitle;
    }

    public void setTeacherTitle(String teacherTitle) {
        this.teacherTitle = teacherTitle;
    }

    public String getTeacherCategory() {
        return teacherCategory;
    }

    public void setTeacherCategory(String teacherCategory) {
        this.teacherCategory = teacherCategory;
    }

    public String getTeacherOrganization() {
        return teacherOrganization;
    }

    public void setTeacherOrganization(String teacherOrganization) {
        this.teacherOrganization = teacherOrganization;
    }

}

