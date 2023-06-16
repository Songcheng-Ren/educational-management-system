package com.scu.springboot.demo.vo;

import com.scu.springboot.demo.entity.Teaches;

import java.util.Date;

public class Class_timeVo extends Teaches {
    private String title;

    private String time_slot_id;

    private String building;

    private int room_no;

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public String getTime_slot_id(){
        return time_slot_id;
    }
    public void setTime_slot_id(String time_slot_id){
        this.time_slot_id=time_slot_id;
    }

    public String getBuilding(){
        return building;
    }
    public void setBuilding(String building){
        this.building=building;
    }

    public int getRoom_no(){
        return room_no;
    }
    public void setRoom_no(int room_no){
        this.room_no=room_no;
    }

}
