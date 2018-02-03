package com.apps.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.apps.pojo.AppInfo;
import com.apps.pojo.AppVersion;

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
	/**
	 * add appInfo
	 */
	public int addAppInfo(AppInfo app);
	/**
	 * 存在验证
	 */
	public int exist(String name);
	/**
	 * 查单个
	 */
	public AppInfo getone(int id);
	/**
	 * 修改
	 */
	public int update(AppInfo a);
	/**
	 * version
	 */
	public AppVersion getVersion(Long id);
}
