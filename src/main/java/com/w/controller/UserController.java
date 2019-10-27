package com.w.controller;

import com.w.domain.UserInfo;
import com.w.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ClassNameUserController
 * @Description
 * @Author ANGLE0
 * @Date2019/10/18 13:28
 * @Version V1.0
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String validateCode, @ModelAttribute UserInfo userInfo, HttpSession session){
        System.out.println(userInfo.toString());
        System.out.println("前台验证码为："+session.getAttribute("back_configcode"));
        //检验验证码
        if (validateCode.equalsIgnoreCase((String) session.getAttribute("back_configcode"))) {
            UserInfo userInfo1 = userService.login(userInfo);
            //登录检测
            if(userInfo1 == null){
                session.setAttribute("user", userInfo1);
                return "ok";
            }
            System.out.println("用户不存在");
        }
        System.out.println("验证码错误");
        return "error";
    }

    @RequestMapping("/register")
    public String register(@ModelAttribute UserInfo userInfo, HttpSession session){
        int reg_result = userService.register(userInfo);
        if (1 == reg_result){
            //用户注册成功
            return "ok";
        }else if (-1 == reg_result){
            //用户已存在
            return "error";
        }
        //用户注册失败,联系管理员
        return "error";
    }


    @RequestMapping("/active")
    public String activeUser(String activeCode){
        int active = userService.active(activeCode);
        if (active > 0) {
            //用户激活成功
            return "ok";
        }
        //用户激活失败
        return "error";
    }

    @RequestMapping("/findAll")
    public String findAll(HttpSession session){
        List<UserInfo> userInfos = userService.findAll();
        session.setAttribute("users", userInfos);
        return "userList";
    }

    @RequestMapping("logout")
    public String logout(){

        return "login";
    }
}
