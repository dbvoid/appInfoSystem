package com.dbvoid.service.backend;

import com.dbvoid.pojo.BackendUser;

/**
 * @author DBVoid
 * @date 2019/9/20 - 15:19
 */
public interface BackendUserService {
    //登录方法
    public BackendUser login(String userCode,String userPassword) throws Exception;
}
