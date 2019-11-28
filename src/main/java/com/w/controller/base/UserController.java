package com.w.controller.base;

import com.w.domain.IUser;
import com.w.service.UserService;
import com.w.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassNameUserController
 * @Description
 * @Author ANGLE0
 * @Date2019/10/18 13:28
 * @Version V1.0
 **/
@CrossOrigin
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("checkUserName.do")
    public String checkUsername(String username, Model model){
        IUser iUser = userService.findUserByName(username);
        if(iUser != null){
            model.addAttribute("user", 1);
        }else{
            model.addAttribute("user", 0);
        }
        return null;
    }

    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public String register(@ModelAttribute IUser IUser) throws Exception {
        System.out.println("接收到的数据"+ IUser.toString());
        int reg_result = userService.register(IUser);
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
    @ResponseBody
    public JsonData activeUser(String activeCode){
        int active = userService.active(activeCode);
        if (active > 0) {
            //用户激活成功
            return new JsonData(0, "用户激活成功", null);
        }
        //用户激活失败
        return new JsonData(0, "用户激活成功", null);
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public JsonData findAll(){
        List IUsers = userService.findAll();
        return JsonData.getJsonData(new JsonData(0, "获取数据成功", IUsers));
    }

    @RequestMapping("/login.do")
    public String login(IUser user, Model model){

        IUser userFromDB = userService.findUserByName(user.getUsername());
        if (userFromDB!=null && userFromDB.getPassword().equals(user.getPassword())) {
            model.addAttribute("user", userFromDB);
            return "ok";
        }
        return "error";
    }
}
