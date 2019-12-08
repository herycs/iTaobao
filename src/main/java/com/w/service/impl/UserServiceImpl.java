package com.w.service.impl;

import com.w.dao.IUserDao;
import com.w.dao.UserRoleDao;
import com.w.domain.IUser;
import com.w.domain.Role;
import com.w.service.UserRoleService;
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
import org.springframework.test.context.jdbc.Sql;

import java.sql.SQLException;
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
        if (IUser1 != null){
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
            String mailText = "<div style=\"padding: 0px 15%;\">\n" +
                    "\t\t\t<h1 style=\"text-align: center;\">iTaobao商城</h1>\n" +
                    "\n" +
                    "\t\t\t<div style=\"border: 1px solid #FFFAFA;margin-left: 100px;background-color: #FFFAF0;padding: 30px;font-size: 20px\">\n" +
                    "\n" +
                    "\t\t\t\t<div style=\"font-size: 20px;padding: 0px 30px 30px\">Hi, "+IUser.getUsername()+"</div>\n" +
                    "\n" +
                    "\t\t\t\t<div style=\"margin-left: 80px;margin-top: 80px;font-size: 20px;\">\n" +
                    "\t\t\t\t\t欢迎注册iTaobao商城，这是一封激活邮件，<a style=\"color: #FFA500; text-decoration: none;\" href='http://192.168.1.244:8080/user/active/"+IUser.getCode()+"'>点击此处</a>激活你的账号\n" +
                    "\t\t\t\t</div>\n" +
                    "<div style=\"padding: 5% ;color:#959DA5;font-size: 14px\">\n" +
                    "\t\t\t\t\t<p>Tips：</p>\n" +
                    "\t\t\t\t\t\t<p style=\"padding-left: 5%;\">如非本人操作，请忽略。 修改密码请<a style=\"color: #FFA500; text-decoration: none;\" href=\"http://192.168.1.244\">点此</a> （如点击无反应，请复制链接 http://localhost:111 至浏览器中打开。）</p>\n" +
                    "\t\t\t\t</div>\n" +
                    "\t\t\t</div>\n" +
                    "\t\t</div>";
            MailUtils.sendMail(IUser.getEmail(), mailText, "激活邮件");
            System.out.println("注册成功");
        }
        return 1;
    }

    @Override
    public int active(String activeCode) throws Exception{
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
    public List<IUser> findAll() throws Exception{
        return IUserDao.findAll();
    }

    @Override
    public IUser findUserByName(String username) throws Exception {
        IUser iUser = IUserDao.findUserByName(username);
        if(iUser == null){
            return null;
        }
        return iUser;
    }


    @Override
    public int updateUser(IUser IUser){
        return 0;
    }

    @Override
    public int deleteUser(int userID) throws SQLException {
        return IUserDao.deleteUser(userID);
    }

    @Override
    public int updatePassword(String password, String phoneNum) throws SQLException {
        IUser iUser = IUserDao.findUserNameAndEmailByPhone(phoneNum);
        int result = IUserDao.updatePassword(bCryptPasswordEncoder.encode(password), phoneNum);
        if(result == 1){
            String mailText = "<div style=\"padding: 0px 15%;\">\n" +
                    "\t\t<h1 style=\"text-align: center;\">iTaobao商城</h1>\n" +
                    "\n" +
                    "\t\t<div style=\"border: 1px solid #FFFAFA;margin-left: 100px;background-color: #FFFAF0;padding: 30px;font-size: 20px\">\n" +
                    "\n" +
                    "\t\t\t<div style=\"font-size: 20px;padding: 0px 30px 30px\">尊敬的用户"+iUser.getUsername()+",您好</div>\n" +
                    "\n" +
                    "\t\t\t<div style=\"margin-left: 80px;margin-top: 80px;font-size: 20px;\">\n" +
                    "\t\t\t\t这是一封提醒邮件，您的iTaobao账号的密码已修改。若非本人操作，为保障您的账户的安全，建议<a style=\"color: #FF0000; text-decoration: none;\" href=\"http:localhost:8080/\">点击此处</a>修改密码。\n" +
                    "\t\t\t</div>\n" +
                    "\t\t\t<div style=\"padding: 5% ;color:#959DA5;font-size: 14px\">\n" +
                    "\t\t\t\t<p>Tips：</p>\n" +
                    "\t\t\t\t\t<p style=\"padding-left: 5%;\">若非本人操作，请忽略。（如点击无反应，请复制链接 http://localhost:111 至浏览器中打开。）</p>\n" +
                    "\t\t\t</div>\n" +
                    "\t\t</div>\n" +
                    "\t</div>";
            MailUtils.sendMail(iUser.getEmail(), mailText, "提醒邮件");
            return 1;
        }
        return -1;
    }


    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        IUser IUser = null;
        try {
            IUser = IUserDao.findUserByName(name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
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

    private List<SimpleGrantedAuthority> getAuthority(List<Role> roles){
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
