package com.apps.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * app_info 
 *
 * @author  
 * @date 2017-11-02 09:21:42
 */
public class AppInfo extends BaseAppInfo{
    /**
     * @note 主键id
     */
    private Long id;

    /**
     * @note 软件名称
     */
    private String softwareName;

    /**
     * @note APK名称（唯一）
     */
    private String APKName;

    /**
     * @note 支持ROM
     */
    private String supportROM;

    /**
     * @note 界面语言
     */
    private String interfaceLanguage;

    /**
     * @note 软件大小（单位：M）
     */
    private BigDecimal softwareSize;

    /**
     * @note 更新日期
     */
    private Date updateDate;

    /**
     * @note 开发者id（来源于：dev_user表的开发者id）
     */
    private Long devId;

    /**
     * @note 应用简介
     */
    private String appInfo;

    /**
     * @note 状态（来源于：data_dictionary，1 待审核 2 审核通过 3 审核不通过 4 已上架 5 已下架）
     */
    private Long status;

    /**
     * @note 上架时间
     */
    private Date onSaleDate;

    /**
     * @note 下架时间
     */
    private Date offSaleDate;

    /**
     * @note 所属平台（来源于：data_dictionary，1 手机 2 平板 3 通用）
     */
    private Long flatformId;

    /**
     * @note 所属三级分类（来源于：data_dictionary）
     */
    private Long categoryLevel3;

    /**
     * @note 下载量（单位：次）
     */
    private Long downloads;

    /**
     * @note 创建者（来源于dev_user开发者信息表的用户id）
     */
    private Long createdBy;

    /**
     * @note 创建时间
     */
    private Date creationDate;

    /**
     * @note 更新者（来源于dev_user开发者信息表的用户id）
     */
    private Long modifyBy;

    /**
     * @note 最新更新时间
     */
    private Date modifyDate;

    /**
     * @note 所属一级分类（来源于：data_dictionary）
     */
    private Long categoryLevel1;

    /**
     * @note 所属二级分类（来源于：data_dictionary）
     */
    private Long categoryLevel2;

    /**
     * @note LOGO图片url路径
     */
    private String logoPicPath;

    /**
     * @note LOGO图片的服务器存储路径
     */
    private String logoLocPath;

    /**
     * @note 最新的版本id
     */
    private Long versionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName == null ? null : softwareName.trim();
    }

    public String getAPKName() {
        return APKName;
    }

    public void setAPKName(String APKName) {
        this.APKName = APKName == null ? null : APKName.trim();
    }

    public String getSupportROM() {
        return supportROM;
    }

    public void setSupportROM(String supportROM) {
        this.supportROM = supportROM == null ? null : supportROM.trim();
    }

    public String getInterfaceLanguage() {
        return interfaceLanguage;
    }

    public void setInterfaceLanguage(String interfaceLanguage) {
        this.interfaceLanguage = interfaceLanguage == null ? null : interfaceLanguage.trim();
    }

    public BigDecimal getSoftwareSize() {
        return softwareSize;
    }

    public void setSoftwareSize(BigDecimal softwareSize) {
        this.softwareSize = softwareSize;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getDevId() {
        return devId;
    }

    public void setDevId(Long devId) {
        this.devId = devId;
    }

    public String getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(String appInfo) {
        this.appInfo = appInfo == null ? null : appInfo.trim();
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Date getOnSaleDate() {
        return onSaleDate;
    }

    public void setOnSaleDate(Date onSaleDate) {
        this.onSaleDate = onSaleDate;
    }

    public Date getOffSaleDate() {
        return offSaleDate;
    }

    public void setOffSaleDate(Date offSaleDate) {
        this.offSaleDate = offSaleDate;
    }

    public Long getFlatformId() {
        return flatformId;
    }

    public void setFlatformId(Long flatformId) {
        this.flatformId = flatformId;
    }

    public Long getCategoryLevel3() {
        return categoryLevel3;
    }

    public void setCategoryLevel3(Long categoryLevel3) {
        this.categoryLevel3 = categoryLevel3;
    }

    public Long getDownloads() {
        return downloads;
    }

    public void setDownloads(Long downloads) {
        this.downloads = downloads;
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

    public Long getCategoryLevel1() {
        return categoryLevel1;
    }

    public void setCategoryLevel1(Long categoryLevel1) {
        this.categoryLevel1 = categoryLevel1;
    }

    public Long getCategoryLevel2() {
        return categoryLevel2;
    }

    public void setCategoryLevel2(Long categoryLevel2) {
        this.categoryLevel2 = categoryLevel2;
    }

    public String getLogoPicPath() {
        return logoPicPath;
    }

    public void setLogoPicPath(String logoPicPath) {
        this.logoPicPath = logoPicPath == null ? null : logoPicPath.trim();
    }

    public String getLogoLocPath() {
        return logoLocPath;
    }

    public void setLogoLocPath(String logoLocPath) {
        this.logoLocPath = logoLocPath == null ? null : logoLocPath.trim();
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }
}