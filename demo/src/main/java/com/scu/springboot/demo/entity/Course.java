package com.scu.springboot.demo.entity;

import lombok.Data;

@Data
public class Course {
    private String tID;
    private String courseID;
    private String date;
    private String title;
    private String building;
    private int roomNo;
}
