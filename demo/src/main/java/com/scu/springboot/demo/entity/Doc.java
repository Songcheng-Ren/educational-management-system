package com.scu.springboot.demo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Doc)实体类
 *
 * @author makejava
 * @since 2022-07-13 16:11:35
 */
public class Doc implements Serializable {
    private static final long serialVersionUID = 437868213550842240L;
    
    private Long docId;
    
    private Long categoryId;
    
    private String docTitle;
    
    private String docSummary;
    
    private String docUploaduser;
    
    private Date docCreatedate;
    
    private String docModifyuser;
    
    private Date docModifydate;
    
    private String docImage;


    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getDocTitle() {
        return docTitle;
    }

    public void setDocTitle(String docTitle) {
        this.docTitle = docTitle;
    }

    public String getDocSummary() {
        return docSummary;
    }

    public void setDocSummary(String docSummary) {
        this.docSummary = docSummary;
    }

    public String getDocUploaduser() {
        return docUploaduser;
    }

    public void setDocUploaduser(String docUploaduser) {
        this.docUploaduser = docUploaduser;
    }

    public Date getDocCreatedate() {
        return docCreatedate;
    }

    public void setDocCreatedate(Date docCreatedate) {
        this.docCreatedate = docCreatedate;
    }

    public String getDocModifyuser() {
        return docModifyuser;
    }

    public void setDocModifyuser(String docModifyuser) {
        this.docModifyuser = docModifyuser;
    }

    public Date getDocModifydate() {
        return docModifydate;
    }

    public void setDocModifydate(Date docModifydate) {
        this.docModifydate = docModifydate;
    }

    public String getDocImage() {
        return docImage;
    }

    public void setDocImage(String docImage) {
        this.docImage = docImage;
    }

}

