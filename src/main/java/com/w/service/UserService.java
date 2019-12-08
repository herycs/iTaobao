package com.w.service;

import com.w.domain.IUser;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.sql.SQLException;
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
    int active(String active) throws Exception;
//    查找所有
    List<IUser> findAll() throws Exception;
//    查找指定用户
    IUser findUserByName(String username) throws Exception;
//    修改用户信息
    int updateUser(IUser IUser) ;
//    删除用户
    int deleteUser(int userID) throws SQLException;

    int updatePassword(String password, String phoneNum) throws SQLException;

}
