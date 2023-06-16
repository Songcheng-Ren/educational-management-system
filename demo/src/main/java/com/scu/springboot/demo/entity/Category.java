package com.scu.springboot.demo.entity;

import java.io.Serializable;

/**
 * (Category)实体类
 *
 * @author makejava
 * @since 2022-07-13 16:14:16
 */
public class Category implements Serializable {
    private static final long serialVersionUID = -34778064159407134L;
    
    private Long categoryId;
    
    private String categoryName;


    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}

