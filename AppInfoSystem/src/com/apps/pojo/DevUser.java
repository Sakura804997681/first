package com.apps.pojo;

import java.util.Date;

/**
 * 
 * dev_user 开发者
 *
 * @author  
 * @date 2017-11-02 09:21:42
 */
public class DevUser {
    /**
     * @note 主键id
     */
    private Long id;

    /**
     * @note 开发者帐号
     */
    private String devCode;

    /**
     * @note 开发者名称
     */
    private String devName;

    /**
     * @note 开发者密码
     */
    private String devPassword;

    /**
     * @note 开发者电子邮箱
     */
    private String devEmail;

    /**
     * @note 开发者简介
     */
    private String devInfo;

    /**
     * @note 创建者（来源于backend_user用户表的用户id）
     */
    private Long createdBy;

    /**
     * @note 创建时间
     */
    private Date creationDate;

    /**
     * @note 更新者（来源于backend_user用户表的用户id）
     */
    private Long modifyBy;

    /**
     * @note 最新更新时间
     */
    private Date modifyDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode == null ? null : devCode.trim();
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName == null ? null : devName.trim();
    }

    public String getDevPassword() {
        return devPassword;
    }

    public void setDevPassword(String devPassword) {
        this.devPassword = devPassword == null ? null : devPassword.trim();
    }

    public String getDevEmail() {
        return devEmail;
    }

    public void setDevEmail(String devEmail) {
        this.devEmail = devEmail == null ? null : devEmail.trim();
    }

    public String getDevInfo() {
        return devInfo;
    }

    public void setDevInfo(String devInfo) {
        this.devInfo = devInfo == null ? null : devInfo.trim();
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}