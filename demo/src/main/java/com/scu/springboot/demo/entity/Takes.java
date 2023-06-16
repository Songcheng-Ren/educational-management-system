package com.scu.springboot.demo.entity;

import java.io.Serializable;

/**
 * (Takes)实体类
 *
 * @author makejava
 * @since 2022-07-15 22:11:53
 */
public class Takes implements Serializable {
    private static final long serialVersionUID = -93011413873811365L;
    
    private String sid;
    
    private String courseId;
    
    private String secId;
    
    private String semester;
    
    private String year;
    
    private Double grade;
    
    private String teacherId;
    
    private String courseEvaluate;


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

    public String getSecId() {
        return secId;
    }

    public void setSecId(String secId) {
        this.secId = secId;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getCourseEvaluate() {
        return courseEvaluate;
    }

    public void setCourseEvaluate(String courseEvaluate) {
        this.courseEvaluate = courseEvaluate;
    }

}

