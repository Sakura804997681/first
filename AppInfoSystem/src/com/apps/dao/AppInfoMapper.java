package com.apps.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.apps.pojo.AppInfo;

/**
 * @note appInfo Dao
 * @author  
 * */
public interface AppInfoMapper {

	/**
	 * @note appInfo 组合查询(分页)
	 * @author  
	 * */
	public List<AppInfo> findAppInfoList(@Param("appInfo") AppInfo appInfo,@Param("currentPageNo") int currentPageNo,@Param("pageSize") int pageSize);
	
	/**
	 * @note appInfo 组合查询 总数量
	 * @author  
	 * */
	public int getAppInfoCount(AppInfo appInfo);
	
}
