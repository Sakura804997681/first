package com.apps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apps.dao.DevUserMapper;
import com.apps.pojo.DevUser;

/**
 * @note devUser 接口实现
 * @author  
 * */
@Service("devUserService")
public class DevUserServiceImpl implements DevUserService{

	@Autowired
	DevUserMapper devMapper;

	/**
	 * @note 登陆验证
	 * @author 
	 * */
	public DevUser loginValidate(String devCode,String devPwd) {
		// TODO Auto-generated method stub
		DevUser dev=devMapper.getDevUser(devCode);
		if(null!=dev) {
			if(devPwd.equals(dev.getDevPassword())) {
				//验证成功
				return dev;
			}
		}
		return null;
	}

	/**
	 * @note 新增开发者
	 * @author  
	 * */
	public boolean addDevUser(DevUser devUser) {
		boolean result=false;
		if(devMapper.insertDevUser(devUser)>0) {
			//操作成功
			if("123".equals(devUser.getDevCode())) {
				throw new RuntimeException("大哥我错了");
			}
			result=true;
		}
		return result;
	}

}
