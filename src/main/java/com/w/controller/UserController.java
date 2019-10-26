package com.w.controller;

import cn.dsna.util.images.ValidateCode;
import com.w.domain.User;
import com.w.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
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
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(String validateCode, @ModelAttribute User user, HttpSession session){
        System.out.println(user.toString());
        System.out.println("前台验证码为："+session.getAttribute("back_configcode"));
//        检验验证码
        if (validateCode.equalsIgnoreCase((String) session.getAttribute("back_configcode"))) {
            User user1 = userService.login(user);
//            登录检测
            if(user1 == null){
                session.setAttribute("user", user1);
                return "ok";
            }
            System.out.println("用户不存在");
        }
        System.out.println("验证码错误");
        return "error";
    }

    @RequestMapping("/register")
    public String register(@ModelAttribute User user, HttpSession session){
        int reg_result = userService.register(user);
        if (1 == reg_result){
//            用户注册成功
            return "ok";
        }else if (-1 == reg_result){
//            用户已存在
            return "error";
        }
//        用户注册失败,联系管理员
        return "error";
    }


    @RequestMapping("/active")
    public String activeUser(String activeCode){
        int active = userService.active(activeCode);
        if (active > 0) {
//            用户激活成功
            return "ok";
        }
//        用户激活失败
        return "error";
    }

    @RequestMapping("/findAll")
    public void findAll(HttpSession session){
        List<User> userList = userService.findAll();
        session.setAttribute("uses", userList);
    }
}
