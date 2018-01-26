package com.apps.dao;

import org.apache.ibatis.annotations.Param;

import com.apps.pojo.DevUser;

/**
 * @note 开发者 Dao
 * @author 
 * */
public interface DevUserMapper {

	/**
	 * @note 根据devCode 查找dev_user
	 * @author 
	 * */
	public DevUser getDevUser(@Param("devCode")String devCode);
	
	/**
	 * @note 新增开发者用户
	 * @author
	 * */
	public int insertDevUser(DevUser devUser);
}
