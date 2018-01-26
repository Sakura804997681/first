package com.apps.service;

import java.util.List;

import com.apps.pojo.AppCategory;

/**
 * @note app 分类  service
 * @author  
 * */
public interface AppCateService {

	/**
	 * @note 根据 parentId 获取app 分类
	 * @author  
	 * */
	public List<AppCategory> getAppCateByCateId(Long parentId);
}
