package com.scu.springboot.demo.entity;

import java.io.Serializable;

/**
 * (CommentOnTeaching)实体类
 *
 * @author makejava
 * @since 2022-07-17 22:32:51
 */
public class CommentOnTeaching implements Serializable {
    private static final long serialVersionUID = 442458418720883122L;
    
    private String tid;
    
    private String score;
    
    private Integer index;
    
    private String courseId;


    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

}

