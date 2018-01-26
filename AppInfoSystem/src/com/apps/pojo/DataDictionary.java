package com.apps.pojo;

import java.util.Date;

/**
 * 
 * data_dictionary 
 *
 * @author  
 * @date 2017-11-02 09:21:42
 */
public class DataDictionary {
    /**
     * @note 主键ID
     */
    private Long id;

    /**
     * @note 类型编码
     */
    private String typeCode;

    /**
     * @note 类型名称
     */
    private String typeName;

    /**
     * @note 类型值ID
     */
    private Long valueId;

    /**
     * @note 类型值Name
     */
    private String valueName;

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

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName == null ? null : valueName.trim();
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