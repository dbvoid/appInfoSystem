package com.dbvoid.service.developer;

import com.dbvoid.dao.devuser.DevUserMapper;
import com.dbvoid.pojo.DevUser;
import com.dbvoid.service.developer.DevUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author layingkun
 * @date 2019/9/5 - 14:20
 */
@Service
public class DevUserServiceImpl implements DevUserService {

    @Resource
    private DevUserMapper devUserMapper;

    @Override
    public DevUser login(String devCode, String devPassword) throws Exception {
        DevUser user = null;
        user = devUserMapper.getLoginUser(devCode);
        //匹配密码
        if(null != user){
            if(!devPassword.equals(user.getDevPassword())){
                user = null;
            }
        }
        return user;
    }
}
