package com.scu.springboot.demo.entity;

import java.io.Serializable;

/**
 * (WorkPlan)实体类
 *
 * @author makejava
 * @since 2022-07-18 09:04:53
 */
public class WorkPlan implements Serializable {
    private static final long serialVersionUID = 230101391239175541L;
    
    private String tid;
    
    private String workPlan;
    
    private String workDate;
    
    private String classname;


    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getWorkPlan() {
        return workPlan;
    }

    public void setWorkPlan(String workPlan) {
        this.workPlan = workPlan;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

}

