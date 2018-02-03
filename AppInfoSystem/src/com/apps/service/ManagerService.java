package com.apps.service;

import com.apps.pojo.BackendUser;

public interface ManagerService {

	public BackendUser login(String code,String pass);
}
