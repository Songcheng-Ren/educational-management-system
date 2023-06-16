package com.scu.springboot.demo.vo;

import com.scu.springboot.demo.entity.CommentOnTeaching;

public class Evaluate_resultVo extends CommentOnTeaching {
    private String avg_score;
    private String name;
    private String title;


    public String getAvg_score() {
        return avg_score;
    }
    public void setAvg_score(String avg_score) {
        this.avg_score = avg_score;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
}
