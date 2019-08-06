package com.dbvoid.dao.appinfo;

import com.dbvoid.pojo.AppInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author DBVoid
 * @date 2019/8/6 - 21:05
 */
public interface AppInfoMapper {
    public int getAppInfoCount(@Param(value="softwareName")String querySoftwareName,
                               @Param(value="status")Integer queryStatus,
                               @Param(value="categoryLevel1")Integer queryCategoryLevel1,
                               @Param(value="categoryLevel2")Integer queryCategoryLevel2,
                               @Param(value="categoryLevel3")Integer queryCategoryLevel3,
                               @Param(value="flatformId")Integer queryFlatformId,
                               @Param(value="devId")Integer devId)throws Exception;

    public List<AppInfo> getAppInfoList(@Param(value="softwareName")String querySoftwareName,
                                        @Param(value="status")Integer queryStatus,
                                        @Param(value="categoryLevel1")Integer queryCategoryLevel1,
                                        @Param(value="categoryLevel2")Integer queryCategoryLevel2,
                                        @Param(value="categoryLevel3")Integer queryCategoryLevel3,
                                        @Param(value="flatformId")Integer queryFlatformId,
                                        @Param(value="devId")Integer devId,
                                        @Param(value="from")Integer currentPageNo,
                                        @Param(value="pageSize")Integer pageSize)throws Exception;
}
