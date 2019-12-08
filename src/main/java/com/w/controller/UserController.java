package com.w.controller;

import com.alibaba.druid.support.spring.stat.annotation.Stat;
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
    public Result checkUsername(@PathVariable("username") String username) throws Exception {
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
        Result result = this.checkUsername(IUser.getUsername());
        if ( 0 == result.getCode()){
            int reg_result = userService.register(IUser);
            if ( 1 == reg_result ){
                //用户注册成功
                return new Result(StateCode.SUCCESS, "用户注册成功");
            }
        }
        //用户注册失败,联系管理员
        return new Result(StateCode.FAILED, "注册失败");
    }

    @RequestMapping(value = "/{userID}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result delUser(@PathVariable("userID") int userID) throws Exception {
        int active  = userService.deleteUser(userID);
        if (active == 1) {
            //用户激活成功
            return new Result(StateCode.SUCCESS, "用户删除成功");
        }
        //用户激活失败
        return new Result(StateCode.SUCCESS, "用户删除失败");
    }

    //    @RequestMapping("/active.do")
    @RequestMapping(value = "/active/{activeCode}", method = RequestMethod.GET)
    @ResponseBody
    public Result activeUser(@PathVariable("activeCode") String activeCode) throws Exception {
        int active = userService.active(activeCode);
        if (active <= 0) {
            //用户激活成功
            return new Result(StateCode.SUCCESS, "用户激活成功");
        }
        //用户激活失败
        return new Result(StateCode.SUCCESS, "用户激活失败，请联系管理员");
    }

    @RequestMapping(value = "/forget/{password}/{phone}/{identify}", method = RequestMethod.PUT)
    @ResponseBody
    public Result resetPassword(@PathVariable("password") String password, @PathVariable("phone") String phone, @PathVariable("identify") String identify) throws Exception {
        int active = 0;
        if (identify != "" && identify.equals("sss")){
            active = userService.updatePassword(password, phone);
            if (active == 1) {
                //用户激活成功
                return new Result(StateCode.SUCCESS, "密码修改成功");
            }
            //用户激活失败
            return new Result(StateCode.SUCCESS, "密码修改失败，请重试");
        }
        return new Result(StateCode.FAILED, "验证码有误,请重新输入");
    }

    //    @RequestMapping("/findAll.do")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result findAll() throws Exception {
        List IUsers = userService.findAll();
        return new Result(StateCode.SUCCESS, "获取数据成功", IUsers);
    }

    //    @RequestMapping("/login.do")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Result login(@RequestBody IUser user, Model model) throws Exception {

        IUser userFromDB = userService.findUserByName(user.getUsername());
        if (userFromDB!=null && userFromDB.getPassword().equals(user.getPassword())) {
            model.addAttribute("user", userFromDB);
            return new Result(StateCode.SUCCESS, "登录成功");
        }
        return new Result(StateCode.LOGINERROR, "登录失败");
    }
}
