package com.w.service.impl;

import com.w.dao.UserDao;
import com.w.domain.User;
import com.w.service.UserService;
import com.w.util.UuidUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.plugin.util.UIUtil;

import java.util.List;

/**
 * @ClassNameUserServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/10/18 13:00
 * @Version V1.0
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) {
        User user1 = userDao.findUser(user);
        if(user1 != null){
            return user1;
        }
        return null;
    }

    @Override
    public int register(User user) {
        /*
        * -1：用户注册失败
        * 1：用户注册成功
        * */
        User user1 = userDao.findUserByName(user.getUsername());
        //账户已存在
        if (user1 != null) {
            return -1;
        }
        //设置激活码
        user1.setCode(UuidUtil.getUuid());
        //设置激活状态
        user1.setStatus("N");
        userDao.save(user);
        return 1;
    }

    @Override
    public int active(String activeCode) {
        User user = userDao.findByActiveCode(activeCode);
        if (user != null) {
            int active = userDao.active(activeCode);
            if (active == 0) {
                return 1;
            }
        }
        return -1;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public List<User> findUserBySomething() {
        return null;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(User user) {
        return 0;
    }
}
