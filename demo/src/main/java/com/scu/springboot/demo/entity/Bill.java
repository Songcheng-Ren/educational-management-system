package com.scu.springboot.demo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Bill)实体类
 *
 * @author makejava
 * @since 2022-07-15 14:24:27
 */
public class Bill implements Serializable {
    private static final long serialVersionUID = -38279452466300366L;
    
    private String sId;
    
    private Double amount;
    
    private String place;
    
    private Date time;
    
    private Double balance;


    public String getSId() {
        return sId;
    }

    public void setSId(String sId) {
        this.sId = sId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

}

