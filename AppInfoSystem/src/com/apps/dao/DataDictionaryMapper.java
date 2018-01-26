package com.apps.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.apps.pojo.DataDictionary;

/**
 * @note 字典 Dao
 * @author  
 * */
public interface DataDictionaryMapper {

	/**
	 * @note 根据typeCode 获取字典
	 * @author  
	 * */
	public List<DataDictionary> getDictionaryByType(@Param("typeCode")String typeCode);
}
