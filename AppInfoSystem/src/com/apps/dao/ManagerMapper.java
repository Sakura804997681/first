package com.apps.dao;

import org.apache.ibatis.annotations.Param;

import com.apps.pojo.BackendUser;

public interface ManagerMapper {

	/**
	 * 查单个
	 */
	public BackendUser getOne(@Param("userCode")String code);
}
