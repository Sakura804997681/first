package com.apps.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apps.dao.DataDictionaryMapper;
import com.apps.pojo.DataDictionary;

/**
 * @note 数据字典 service 实现
 * @author  
 * */
@Service
public class DataDictionaryServiceImpl implements DataDictionaryService{

	@Resource
	DataDictionaryMapper dictionaryMapper;
	
	public List<DataDictionary> getDictionaryByType(String typeCode) {
		// TODO Auto-generated method stub
		return dictionaryMapper.getDictionaryByType(typeCode);
	}

}
