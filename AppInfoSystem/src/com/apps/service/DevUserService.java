package com.apps.service;

import com.apps.pojo.DevUser;

/**
 * @note 开发者 service
 * @author  
 * */
public interface DevUserService {

	/**
	 * @note 登陆验证
	 * @author 
	 * */
	public DevUser loginValidate(String devCode,String devPwd);
	
	/**
	 * @note 新增开发者
	 * @author  
	 * */
	public boolean addDevUser(DevUser devUser);
}
