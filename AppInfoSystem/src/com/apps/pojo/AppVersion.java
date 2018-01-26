package com.apps.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * app_version 
 *
 * @author  
 * @date 2017-11-02 09:21:42
 */
public class AppVersion {
    /**
     * @note 主键id
     */
    private Long id;

    /**
     * @note appId（来源于：app_info表的主键id）
     */
    private Long appId;

    /**
     * @note 版本号
     */
    private String versionNo;

    /**
     * @note 版本介绍
     */
    private String versionInfo;

    /**
     * @note 发布状态（来源于：data_dictionary，1 不发布 2 已发布 3 预发布）
     */
    private Long publishStatus;

    /**
     * @note 下载链接
     */
    private String downloadLink;

    /**
     * @note 版本大小（单位：M）
     */
    private BigDecimal versionSize;

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
     * @note apk文件的服务器存储路径
     */
    private String apkLocPath;

    /**
     * @note 上传的apk文件名称
     */
    private String apkFileName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo == null ? null : versionNo.trim();
    }

    public String getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(String versionInfo) {
        this.versionInfo = versionInfo == null ? null : versionInfo.trim();
    }

    public Long getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Long publishStatus) {
        this.publishStatus = publishStatus;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink == null ? null : downloadLink.trim();
    }

    public BigDecimal getVersionSize() {
        return versionSize;
    }

    public void setVersionSize(BigDecimal versionSize) {
        this.versionSize = versionSize;
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

    public String getApkLocPath() {
        return apkLocPath;
    }

    public void setApkLocPath(String apkLocPath) {
        this.apkLocPath = apkLocPath == null ? null : apkLocPath.trim();
    }

    public String getApkFileName() {
        return apkFileName;
    }

    public void setApkFileName(String apkFileName) {
        this.apkFileName = apkFileName == null ? null : apkFileName.trim();
    }
}