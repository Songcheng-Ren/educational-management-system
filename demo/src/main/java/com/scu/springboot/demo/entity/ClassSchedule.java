package com.scu.springboot.demo.entity;

import java.io.Serializable;

/**
 * (ClassSchedule)实体类
 *
 * @author makejava
 * @since 2022-07-19 13:34:49
 */
public class ClassSchedule implements Serializable {
    private static final long serialVersionUID = -14956284580576575L;
    
    private String sid;
    
    private String courseId;
    
    private String courseName;
    
    private String deptName;
    
    private Integer credits;
    
    private String time;
    
    private String place;


    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

}

