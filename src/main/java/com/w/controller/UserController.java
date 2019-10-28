package com.w.controller;

import com.w.domain.UserInfo;
import com.w.formatter.MyDateFormatter;
import com.w.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register.do",method = RequestMethod.POST)
    public String register(@ModelAttribute UserInfo userInfo, HttpSession session) throws Exception {
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

    @RequestMapping("/active.do")
    public String activeUser(String activeCode){
        int active = userService.active(activeCode);
        if (active > 0) {
            //用户激活成功
            return "ok";
        }
        //用户激活失败
        return "error";
    }

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView modelAndView=new ModelAndView();
        List<UserInfo> userInfos = userService.findAll();
        for(UserInfo u: userInfos){
            System.out.println(u.toString());
        }
        modelAndView.addObject("users",userInfos);
        modelAndView.setViewName("userList");
        return modelAndView;
    }
}
