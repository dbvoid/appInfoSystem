package com.dbvoid.service.developer;

import com.dbvoid.dao.appinfo.AppInfoMapper;
import com.dbvoid.pojo.AppInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author DBVoid
 * @date 2019/8/6 - 21:03
 */
@Service
public class AppInfoServiceImpl implements AppInfoService {
    @Resource
    private AppInfoMapper appInfoMapper;



    @Override
    public int getAppInfoCount(String querySoftwareName, Integer queryStatus, Integer queryCategoryLevel1, Integer queryCategoryLevel2, Integer queryCategoryLevel3, Integer queryFlatformId, Integer devId) throws Exception {
       return appInfoMapper.getAppInfoCount(querySoftwareName,queryStatus,queryCategoryLevel1,queryCategoryLevel2,queryCategoryLevel3,queryFlatformId,devId);
    }

    @Override
    public List<AppInfo> getAppInfoList(String querySoftwareName, Integer queryStatus, Integer queryCategoryLevel1, Integer queryCategoryLevel2, Integer queryCategoryLevel3, Integer queryFlatformId, Integer devId, Integer currentPageNo, int pageSize) throws Exception {
        currentPageNo = (currentPageNo-1)*pageSize;
        List<AppInfo> appInfoList = appInfoMapper.getAppInfoList(querySoftwareName, queryStatus, queryCategoryLevel1, queryCategoryLevel2, queryCategoryLevel3, queryFlatformId, devId, currentPageNo, pageSize);
        return appInfoList;
    }

    @Override
    public boolean add(AppInfo appInfo) throws Exception {
        // TODO Auto-generated method stub
        boolean flag = false;
        if(appInfoMapper.add(appInfo) > 0){
            flag = true;
        }
        return flag;
    }

    @Override
    public AppInfo getAppInfo(Integer id, String APKName) throws Exception {
        return appInfoMapper.getAppInfo(id,APKName);
    }
}
