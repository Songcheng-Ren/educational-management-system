package com.scu.springboot.demo.vo;

import com.scu.springboot.demo.entity.Exam;

public class Teacher_scheduleVo extends Exam {
    private String tid;

    private String course_name;


    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }


    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
}
