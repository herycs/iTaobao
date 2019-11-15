package com.w.service.impl;

import com.w.dao.IUserDao;
import com.w.dao.UserRoleDao;
import com.w.domain.IUser;
import com.w.domain.Role;
import com.w.service.UserService;
import com.w.util.MailUtils;
import com.w.util.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

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
    private IUserDao IUserDao;

    @Autowired
    private UserRoleDao userRoleDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public int register(IUser IUser) throws Exception{
        /*
        * -1：用户注册失败
        * 1：用户注册成功
        * */
        IUser IUser1 = IUserDao.findUserByName(IUser.getUsername());
        //账户已存在
        if (IUser1 != null) {
            System.out.println("用户存在");
            return -1;
        }
        IUser.setPassword(bCryptPasswordEncoder.encode(IUser.getPassword()));
        //设置激活码
        IUser.setCode(UuidUtil.getUuid());
        //设置激活状态
        IUser.setStatus(0);
        int save_result = IUserDao.save(IUser);
        if(save_result != 1){
            System.out.println("注册失败");
            return -1;
        }else{
            String mailText = "<h1>这是来自iTaobao商城的一封注册邮件，<a href='localhost:8080/active.do?activeCode="+IUser.getCode()+"'>点击激活</a>您的账号,若非本人操作请忽略</h1>";
            MailUtils.sendMail(IUser.getEmail(), mailText, "激活邮件");
            System.out.println("注册成功");
        }
        return 1;
    }

    @Override
    public int active(String activeCode) {
        IUser IUser = IUserDao.findByActiveCode(activeCode);
        if (IUser != null) {
            //添加用户身份
            userRoleDao.addRoleForUser(IUser.getUserID(), 1);
            int active = IUserDao.active(activeCode);
            if (active == 0) {
                return 1;
            }
        }
        return -1;
    }

    @Override
    public List<IUser> findAll() {
        return IUserDao.findAll();
    }

    @Override
    public IUser findUserByName(String username) {
        IUser iUser = IUserDao.findUserByName(username);
        if(iUser == null){
            return null;
        }
        return iUser;
    }


    @Override
    public int updateUser(IUser IUser) {
        return 0;
    }

    @Override
    public int deleteUser(IUser IUser) {
        return 0;
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        IUser IUser = null;
        IUser = IUserDao.findUserByName(name);
        List<Role> roles = IUser.getRoles();
        List<SimpleGrantedAuthority> authoritys = getAuthority(roles);
        User user = new User(IUser.getUsername(),
                IUser.getPassword(),
                IUser.getStatus() == 0 ? false:true,
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
