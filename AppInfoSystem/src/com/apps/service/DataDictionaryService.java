package com.apps.service;

import java.util.List;

import com.apps.pojo.DataDictionary;

/**
 * @note 数据字典 service
 * @author  
 * */
public interface DataDictionaryService {

	/**
	 * @note 根据typeCode 获取数据字典
	 * @author  
	 * */
	public List<DataDictionary> getDictionaryByType(String typeCode);
}
