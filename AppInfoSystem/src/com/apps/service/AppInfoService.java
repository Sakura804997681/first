package com.apps.service;

import java.util.List;

import com.apps.pojo.AppInfo;
import com.apps.tools.PageSupport;

/**
 * @note appInfo service
 * @author  
 * */
public interface AppInfoService {

	public List<AppInfo> getAppInfo(AppInfo appInfo,int currentPageNo,int pageSize);
	
	/**
	 * @note 组合条件 查询 分页
	 * @author  
	 * */
	public PageSupport getAppInfos(AppInfo appInfo,int currentPageNo,int pageSize);
	/**
	 * 存在验证
	 */
	public int exist(String name);
	/**
	 * 添加 appinfo
	 */
	public int addappInfo(AppInfo a);
}
