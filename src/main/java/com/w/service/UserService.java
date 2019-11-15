package com.w.service;

import com.w.domain.IUser;
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
//    注册
    int register(IUser IUser) throws Exception;
//    激活
    int active(String active);
//    查找所有
    List<IUser> findAll();
//    查找指定用户
    IUser findUserByName(String username);
//    修改用户信息
    int updateUser(IUser IUser);
//    删除用户
    int deleteUser(IUser IUser);
}
