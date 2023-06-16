package com.scu.springboot.demo.entity;

import java.io.Serializable;

/**
 * (Fee)实体类
 *
 * @author makejava
 * @since 2022-07-16 15:01:39
 */
public class Fee implements Serializable {
    private static final long serialVersionUID = -59046025313040308L;
    
    private String sid;
    
    private String costName;
    
    private Double cost;
    
    private String payDate;
    
    private String costState;


    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getCostName() {
        return costName;
    }

    public void setCostName(String costName) {
        this.costName = costName;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getCostState() {
        return costState;
    }

    public void setCostState(String costState) {
        this.costState = costState;
    }

}

