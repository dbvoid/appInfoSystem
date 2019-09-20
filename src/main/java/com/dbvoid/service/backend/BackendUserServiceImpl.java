package com.dbvoid.service.backend;

import com.dbvoid.dao.backenduser.BackendUserMapper;
import com.dbvoid.pojo.BackendUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author DBVoid
 * @date 2019/9/20 - 15:21
 */
@Service
public class BackendUserServiceImpl implements BackendUserService {
    @Resource
    private BackendUserMapper backendUserMapper;

    @Override
    public BackendUser login(String userCode, String userPassword) throws Exception{
        BackendUser backendUser = null;

        backendUser = backendUserMapper.getLoginUser(userCode);

        if(null != backendUser){
            //再判断密码是否符合
            if(!userPassword.equals(backendUser.getUserPassword())){
                backendUser = null;
            }
        }
        return backendUser;
    }
}
