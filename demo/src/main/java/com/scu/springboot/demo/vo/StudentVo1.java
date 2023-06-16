package com.scu.springboot.demo.vo;

public class StudentVo1 {

    private  String deptName;

    private int count_enter;

    private int count_all;

    private double count_rate;

    public String  getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


    public int getCount_enter() {
        return count_enter;
    }

    public void setCount_enter(int count_enter) {
        this.count_enter = count_enter;
    }


    public int getCount_all() {
        return count_all;
    }

    public void setCount_all(int count_all) {
        this.count_all = count_all;
    }


    public double getCount_rate() {
        return count_rate;
    }

    public void setCount_rate(double count_rate) {
        this.count_rate = count_rate;
    }
}
