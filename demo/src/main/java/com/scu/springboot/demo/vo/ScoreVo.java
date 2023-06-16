package com.scu.springboot.demo.vo;

import com.scu.springboot.demo.entity.Takes;

public class ScoreVo extends Takes {
    private String score;

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
