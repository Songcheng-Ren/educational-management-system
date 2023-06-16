package com.scu.springboot.demo.vo;

import com.scu.springboot.demo.entity.Exam;

public class ExamVo extends Exam {
    private String sid;

    private String course_name;


    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }


    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
}
