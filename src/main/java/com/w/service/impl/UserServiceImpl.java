package com.w.service.impl;

import com.w.dao.UserDao;
import com.w.domain.Role;
import com.w.domain.UserInfo;
import com.w.service.UserService;
import com.w.util.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
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
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public int register(UserInfo userInfo) throws Exception{
        /*
        * -1：用户注册失败
        * 1：用户注册成功
        * */
        UserInfo userInfo1 = userDao.findUserByName(userInfo.getUsername());
        //账户已存在
        if (userInfo1 != null) {
            return -1;
        }
        userInfo.setPassword(bCryptPasswordEncoder.encode(userInfo.getPassword()));
        //设置激活码
        userInfo1.setCode(UuidUtil.getUuid());
        //设置激活状态
        userInfo1.setStatus(0);
        userDao.save(userInfo);
        return 1;
    }

    @Override
    public int active(String activeCode) {
        UserInfo userInfo = userDao.findByActiveCode(activeCode);
        if (userInfo != null) {
            int active = userDao.active(activeCode);
            if (active == 0) {
                return 1;
            }
        }
        return -1;
    }

    @Override
    public List<UserInfo> findAll() {
        return userDao.findAll();
    }

    @Override
    public List<UserInfo> findUserBySomething() {
        return null;
    }

    @Override
    public int updateUser(UserInfo userInfo) {
        return 0;
    }

    @Override
    public int deleteUser(UserInfo userInfo) {
        return 0;
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        UserInfo userInfo = null;
        userInfo = userDao.findUserByName(name);
        List<Role> roles = userInfo.getRoles();
        List<SimpleGrantedAuthority> authoritys = getAuthority(roles);
        User user = new User(userInfo.getUsername(),
                "{noop}"+userInfo.getPassword(),
                userInfo.getStatus() == 0 ? false:true,
                true,
                true,
                true,
                authoritys);
        return user;
    }

    private List<SimpleGrantedAuthority> getAuthority(List<Role> roles) {
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        if (list != null) {
            for (Role role: roles){
                System.out.println(role.getRoleName());
                list.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleName()));
            }
        }
        return list;
    }
}
