package com.apps.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apps.dao.AppInfoMapper;
import com.apps.pojo.AppInfo;
import com.apps.pojo.AppVersion;
import com.apps.tools.PageSupport;

/**
 * @note appInfo 
 * @author  
 * */
@Service
public class AppInfoServiceImpl implements AppInfoService{

	@Resource
	AppInfoMapper appInfoMapper;
	
	public List<AppInfo> getAppInfo(AppInfo appInfo,int currentPageNo,int pageSize) {
		// TODO Auto-generated method stub
		return appInfoMapper.findAppInfoList(appInfo,currentPageNo,pageSize);
	}
	
	/**
	 * @note 根据组合条件 分页查询
	 * @author  
	 * */
	public PageSupport getAppInfos(AppInfo appInfo,int currentPageNo,int pageSize) {
		List<AppInfo> data=appInfoMapper.findAppInfoList(appInfo,(currentPageNo-1)*pageSize,pageSize);
		int count=appInfoMapper.getAppInfoCount(appInfo);
		System.out.println("===========================>count"+count+
				"|"+appInfo.getStatus());
		PageSupport page=new PageSupport();
		page.setData(data);
		page.setPageSize(pageSize);
		page.setTotalCount(count);
		page.setCurrentPageNo(currentPageNo);
		return page;
	}

	@Override
	public int exist(String name) {
		// TODO Auto-generated method stub
		return appInfoMapper.exist(name);
	}

	@Override
	public int addappInfo(AppInfo a) {
		// TODO Auto-generated method stub
		return appInfoMapper.addAppInfo(a);
	}

	@Override
	public AppInfo getOne(int id) {
		// TODO Auto-generated method stub
		return appInfoMapper.getone(id);
	}

	@Override
	public int update(AppInfo a) {
		// TODO Auto-generated method stub
		return appInfoMapper.update(a);
	}

	@Override
	public AppVersion getversion(Long id) {
		// TODO Auto-generated method stub
		return appInfoMapper.getVersion(id);
	}

}
