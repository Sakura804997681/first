package com.apps.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.apps.pojo.AppCategory;

/**
 * @note app 分类
 * @author  
 * */
public interface AppCateMapper {

	/**
	 * @note 根据分类Id 获取分类
	 * @author  
	 * */
	public List<AppCategory> getAppCateByCateId(@Param("parentId")Long parentId);
}
