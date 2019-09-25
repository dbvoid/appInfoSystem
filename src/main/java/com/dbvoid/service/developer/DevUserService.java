package com.dbvoid.service.developer;

import com.dbvoid.pojo.DevUser;

/**
 * @author layingkun
 * @date 2019/9/5 - 14:20
 */

public interface DevUserService {

    /**
     * 用户登录
     * @param devCode
     * @param devPassword
     * @return
     * @throws Exception
     */
    public DevUser login(String devCode,String devPassword) throws Exception;
}
