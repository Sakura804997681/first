package com.apps.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apps.dao.ManagerMapper;
import com.apps.pojo.BackendUser;
@Service
public class ManagerServiceImpl implements ManagerService{

	@Resource
	private ManagerMapper man;
	@Override
	public BackendUser login(String code,String pass) {
		// TODO Auto-generated method stub
		BackendUser u=man.getOne(code);
		if(null!=u){
			if(pass.equals(u.getUserPassword())){
				return u;
			}
		}
		return null;
	}

}
