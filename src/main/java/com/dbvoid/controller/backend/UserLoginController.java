package com.dbvoid.controller.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author DBVoid
 * @date 2019/8/5 - 13:36
 */
@RequestMapping("/manager")
@Controller
public class UserLoginController {

    @RequestMapping("/login")
    public String login(){
        return "backendlogin";
    }
}
