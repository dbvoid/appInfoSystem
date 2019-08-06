package com.dbvoid.service.developer;

import java.util.List;
import javax.annotation.Resource;

import com.dbvoid.dao.appcategory.AppCategoryMapper;
import com.dbvoid.pojo.AppCategory;
import org.springframework.stereotype.Service;

@Service
public class AppCategoryServiceImpl implements AppCategoryService {

	@Resource
	private AppCategoryMapper mapper;
	
	@Override
	public List<AppCategory> getAppCategoryListByParentId(Integer parentId)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAppCategoryListByParentId(parentId);
	}

}
