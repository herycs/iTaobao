package com.w.service;

import com.w.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassNameUserService
 * @Description
 * @Author ANGLE0
 * @Date2019/10/18 10:35
 * @Version V1.0b
 **/
public interface UserService {
//    登录
    User login(User user);
//    注册
    int register(User user);
//    激活
    int active(String active);
//    查找所有
    List<User> findAll();
//    查找指定用户
    List<User> findUserBySomething();
//    修改用户信息
    int updateUser(User user);
//    删除用户
    int deleteUser(User user);
}
