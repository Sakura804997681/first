package com.apps.pojo;

import java.util.Date;

/**
 * 
 * app_category 
 *
 * @author 
 * @date 2017-11-02 09:21:42
 */
public class AppCategory {
    /**
     * @note 主键ID
     */
    private Long id;

    /**
     * @note 分类编码
     */
    private String categoryCode;

    /**
     * @note 分类名称
     */
    private String categoryName;

    /**
     * @note 父级节点id
     */
    private Long parentId;

    /**
     * @note 创建者（来源于backend_user用户表的用户id）
     */
    private Long createdBy;

    /**
     * @note 创建时间
     */
    private Date creationTime;

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

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode == null ? null : categoryCode.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
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