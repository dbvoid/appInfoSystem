package com.dbvoid.dao.backenduser;

import com.dbvoid.pojo.BackendUser;
import org.apache.ibatis.annotations.Param;

/**
 * @author DBVoid
 * @date 2019/9/20 - 15:25
 */
public interface BackendUserMapper {

    /**
     * 通过userCode获取BcakendUser
     * @param userCode
     * @return
     * @throws Exception
     */
    public BackendUser getLoginUser(@Param("userCode") String userCode) throws Exception;
}
