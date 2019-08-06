package com.dbvoid.dao.appcategory;

import java.util.List;

import com.dbvoid.pojo.AppCategory;
import org.apache.ibatis.annotations.Param;

public interface AppCategoryMapper {
	
	public List<AppCategory> getAppCategoryListByParentId(@Param("parentId") Integer parentId)throws Exception;
}
