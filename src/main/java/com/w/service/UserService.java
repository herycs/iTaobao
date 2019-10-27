package com.w.service;

import com.w.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @ClassNameUserService
 * @Description
 * @Author ANGLE0
 * @Date2019/10/18 10:35
 * @Version V1.0b
 **/
public interface UserService extends UserDetailsService {
//    登录
    UserInfo login(UserInfo userInfo);
//    注册
    int register(UserInfo userInfo);
//    激活
    int active(String active);
//    查找所有
    List<UserInfo> findAll();
//    查找指定用户
    List<UserInfo> findUserBySomething();
//    修改用户信息
    int updateUser(UserInfo userInfo);
//    删除用户
    int deleteUser(UserInfo userInfo);
}
