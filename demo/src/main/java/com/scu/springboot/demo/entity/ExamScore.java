package com.scu.springboot.demo.entity;

import java.io.Serializable;

/**
 * (ExamScore)实体类
 *
 * @author makejava
 * @since 2022-07-16 15:53:38
 */
public class ExamScore implements Serializable {
    private static final long serialVersionUID = 540746090131094630L;
    
    private String courseName;
    
    private String sid;
    
    private String credit;
    
    private String courseAttribute;
    
    private String examType;
    
    private String score;


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getCourseAttribute() {
        return courseAttribute;
    }

    public void setCourseAttribute(String courseAttribute) {
        this.courseAttribute = courseAttribute;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

}

