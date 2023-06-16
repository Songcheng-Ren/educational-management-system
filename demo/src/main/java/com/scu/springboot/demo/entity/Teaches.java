package com.scu.springboot.demo.entity;

import java.io.Serializable;

/**
 * (Teaches)实体类
 *
 * @author makejava
 * @since 2022-07-20 02:27:12
 */
public class Teaches implements Serializable {
    private static final long serialVersionUID = -98286440505980748L;
    
    private String tid;
    
    private String courseId;
    
    private String secId;
    
    private String semester;
    
    private Integer year;


    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

}

