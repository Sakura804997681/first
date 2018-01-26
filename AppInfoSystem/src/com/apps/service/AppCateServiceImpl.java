package com.apps.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apps.dao.AppCateMapper;
import com.apps.pojo.AppCategory;

/**
 * @note app 分类service 实现
 * @author  
 * */
@Service
public class AppCateServiceImpl implements AppCateService{

	@Resource
	AppCateMapper appCateMapper;
	
	public List<AppCategory> getAppCateByCateId(Long parentId) {
		// TODO Auto-generated method stub
		return appCateMapper.getAppCateByCateId(parentId);
	}

}
