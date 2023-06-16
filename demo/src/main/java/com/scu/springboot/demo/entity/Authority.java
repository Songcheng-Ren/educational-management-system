package com.scu.springboot.demo.entity;

import java.io.Serializable;

/**
 * (Authority)实体类
 *
 * @author makejava
 * @since 2022-07-13 16:10:34
 */
public class Authority implements Serializable {
    private static final long serialVersionUID = 754273420205703797L;
    
    private Long authorityId;
    
    private String authorityName;


    public Long getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Long authorityId) {
        this.authorityId = authorityId;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

}

