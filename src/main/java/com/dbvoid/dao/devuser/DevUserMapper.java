package com.dbvoid.dao.devuser;

import com.dbvoid.pojo.DevUser;
import org.apache.ibatis.annotations.Param;

/**
 * @author layingkun
 * @date 2019/9/5 - 14:12
 */
public interface DevUserMapper {
    /**
     * 通过userCode获取user
     * @param devCode
     * @return
     * @throws Exception
     */
    public DevUser getLoginUser(@Param("devCode") String devCode) throws Exception;
}
