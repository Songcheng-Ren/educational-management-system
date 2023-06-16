package com.scu.springboot.demo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Exam)实体类
 *
 * @author makejava
 * @since 2022-07-17 11:04:29
 */
public class Exam implements Serializable {
    private static final long serialVersionUID = 647266112393102682L;
    
    private String courseId;
    
    private String secId;
    
    private String semester;
    
    private String year;
    
    private Integer examId;
    
    private String building;
    
    private Integer roomNo;
    
    private Date time;
    
    private String duration;


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

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public Integer getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Integer roomNo) {
        this.roomNo = roomNo;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

}

