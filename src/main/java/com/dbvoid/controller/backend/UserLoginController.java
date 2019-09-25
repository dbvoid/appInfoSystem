package com.dbvoid.controller.backend;

import com.dbvoid.pojo.BackendUser;
import com.dbvoid.service.backend.BackendUserService;
import com.dbvoid.utils.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author layingkun
 * @date 2019/9/5 - 13:36
 */
@RequestMapping("/manager")
@Controller
public class UserLoginController {

    @Resource
    private BackendUserService backendUserService;

    @RequestMapping("/login")
    public String login(){
        return "backendlogin";
    }

    //登录
    @PostMapping("/dologin")
    public String doLogin(@RequestParam String userCode, @RequestParam String userPassword, HttpServletRequest request, HttpSession session){
        //调用service方法,进行用户匹配
        BackendUser backendUser = null;

        try{
            backendUser = backendUserService.login(userCode,userPassword);
        }catch (Exception e){
            e.printStackTrace();
        }

        if(null != backendUser){
            //登录成功
            //放入session
            session.setAttribute(Constants.USER_SESSION,backendUser);
            //页面跳转到后台主页
            return "redirect:/manager/backend/main";
        }else{
            //登录失败
            //转发到登录页,并带出错误信息
            request.setAttribute("error","用户名或密码有误!");
            return "backendlogin";
        }
    }

    /**
     * 登录成功后跳转到后台主页,跳转之前先0判断是否登录
     * @param session
     * @return
     */
    @RequestMapping("/backend/main")
    public String main(HttpSession session){
        //判断是否已登录
        if(session.getAttribute(Constants.USER_SESSION) == null){
            //未登录,重定向到登录页
            return "redirect:/manager/login";
        }

        return "backend/main";
    }

    /**
     * 退出登录
     * @return
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        //清除session
        session.removeAttribute(Constants.USER_SESSION);
        return "backendlogin";
    }


}
