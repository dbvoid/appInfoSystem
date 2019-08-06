package com.dbvoid.service.developer;

import java.util.List;

import javax.annotation.Resource;

import com.dbvoid.dao.datadictionary.DataDictionaryMapper;
import com.dbvoid.pojo.DataDictionary;
import org.springframework.stereotype.Service;


@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {
	
	@Resource
	private DataDictionaryMapper mapper;
	
	@Override
	public List<DataDictionary> getDataDictionaryList(String typeCode)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.getDataDictionaryList(typeCode);
	}

}
