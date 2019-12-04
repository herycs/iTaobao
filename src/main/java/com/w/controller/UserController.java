package com.w.controller;

import com.w.common.entity.StateCode;
import com.w.domain.IUser;
import com.w.service.UserService;
import com.w.common.entity.Result;
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

//    @RequestMapping("checkUserName.do")
    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    @ResponseBody
    public Result checkUsername(@PathVariable("username") String username){
        IUser iUser = userService.findUserByName(username);
        if(iUser != null){
            return new Result(StateCode.FAILED, "用户名已存在");
        }else{
            return new Result(StateCode.SUCCESS, "用户名可用");
        }
    }

//    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Result register(@RequestBody IUser IUser) throws Exception {
        //检测用户名是否重复
        this.checkUsername(IUser.getUsername());
        int reg_result = userService.register(IUser);
        if (1 == reg_result){
            //用户注册成功
            return new Result(StateCode.SUCCESS, "用户注册成功");
        }
        //用户注册失败,联系管理员
        return new Result(StateCode.FAILED, "注册失败，请联系管理员");
    }

//    @RequestMapping("/active.do")
    @RequestMapping(value = "/{activeCode}", method = RequestMethod.PUT)
    @ResponseBody
    public Result activeUser(@PathVariable("activeCode") String activeCode){
        int active = userService.active(activeCode);
        if (active > 0) {
            //用户激活成功
            return new Result(StateCode.SUCCESS, "用户激活成功");
        }
        //用户激活失败
        return new Result(StateCode.SUCCESS, "用户激活失败");
    }

//    @RequestMapping("/findAll.do")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result findAll(){
        List IUsers = userService.findAll();
        return new Result(StateCode.SUCCESS, "获取数据成功", IUsers);
    }

//    @RequestMapping("/login.do")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Result login(@RequestBody IUser user, Model model){

        IUser userFromDB = userService.findUserByName(user.getUsername());
        if (userFromDB!=null && userFromDB.getPassword().equals(user.getPassword())) {
            model.addAttribute("user", userFromDB);
            return new Result(StateCode.SUCCESS, "登录成功");
        }
        return new Result(StateCode.LOGINERROR, "登录失败");
    }
}
