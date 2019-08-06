package com.dbvoid.controller.developer;

import com.dbvoid.pojo.DevUser;
import com.dbvoid.service.developer.DevUserService;
import com.dbvoid.utils.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author DBVoid
 * @date 2019/8/5 - 13:59
 */
@RequestMapping("/dev")
@Controller
public class DevLoginController {
    @Resource
    private DevUserService devUserService;

    //来到登录页面
    @RequestMapping("/login")
    public String login(){
        return "devlogin";
    }

    //登录
    @PostMapping("/dologin")
    public String doLogin(@RequestParam String devCode, @RequestParam String devPassword, HttpServletRequest request, HttpSession session) {
        DevUser user = null;
        try {
            user = devUserService.login(devCode, devPassword);
        }catch (Exception e){
            e.printStackTrace();
        }

        if(user != null){
            //登录成功
            //放入session
            session.setAttribute(Constants.DEV_USER_SESSION,user);
            //页面跳转到(main.jsp)
            return "redirect:/dev/flatform/main";
        }else {
            //否则跳转到(login.jsp)带出提示信息转发
            request.setAttribute("error","用户名或密码不正确");
            return "devlogin";
        }
    }

    /**
     * 直接显示开发主页,先判断session是否有值
     * @param session
     * @return
     */
    @RequestMapping("/flatform/main")
    public String main(HttpSession session){
        if(session.getAttribute(Constants.DEV_USER_SESSION ) == null) {
            return "devlogin";
        }
        return "developer/main";
    }

    //退出登录
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute(Constants.DEV_USER_SESSION);
        return "devlogin";
    }
}
