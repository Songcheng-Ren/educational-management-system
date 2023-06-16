package com.scu.springboot.demo.vo;
import com.scu.springboot.demo.entity.Takes;
public class EvaluateVo extends Takes{
    private String course_name;
    private String teacher_name;
    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }


    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

}
