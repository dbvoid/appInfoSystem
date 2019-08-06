package com.dbvoid.service.developer;

import com.dbvoid.pojo.AppInfo;

import java.util.List;

/**
 * @author DBVoid
 * @date 2019/8/6 - 21:01
 */
public interface AppInfoService {
    /**
     * 根据条件查询appInfo表记录数
     * @param querySoftwareName
     * @param queryStatus
     * @param queryCategoryLevel1
     * @param queryCategoryLevel2
     * @param queryCategoryLevel3
     * @param queryFlatformId
     * @param devId
     * @return
     * @throws Exception
     */
    public int getAppInfoCount(String querySoftwareName,Integer queryStatus,
                               Integer queryCategoryLevel1,Integer queryCategoryLevel2,
                               Integer queryCategoryLevel3,Integer queryFlatformId,Integer devId)throws Exception;

    /**
     * 根据条件查询出app列表
     * @param querySoftwareName
     * @param queryStatus
     * @param queryCategoryLevel1
     * @param queryCategoryLevel2
     * @param queryCategoryLevel3
     * @param queryFlatformId
     * @param devId
     * @param currentPageNo
     * @param pageSize
     * @return
     */
    List<AppInfo> getAppInfoList(String querySoftwareName, Integer queryStatus, Integer queryCategoryLevel1, Integer queryCategoryLevel2, Integer queryCategoryLevel3, Integer queryFlatformId, Integer devId, Integer currentPageNo, int pageSize) throws Exception;
}
