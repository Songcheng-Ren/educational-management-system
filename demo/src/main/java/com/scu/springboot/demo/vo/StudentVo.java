package com.scu.springboot.demo.vo;

import com.scu.springboot.demo.entity.Student;

public class StudentVo extends Student {
    private int count_home;

    private int count_enter;

    private int count_all;

    private double count_rate;

    public int getCount_home() {
        return count_home;
    }

    public void setCount_home(int count_home) {
        this.count_home = count_home;
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
