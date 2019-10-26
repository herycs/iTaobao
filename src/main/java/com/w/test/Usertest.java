package com.w.test;

import com.w.dao.UserDao;
import com.w.domain.User;
import com.w.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSessionManager;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassNameUsertest
 * @Description
 * @Author ANGLE0
 * @Date2019/10/26 13:12
 * @Version V1.0
 **/
public class Usertest {

    @Autowired
    private UserService userService;

    @Autowired
    UserDao userDao;
    @Test
    public void findAll(){

//        User user = new User();
//        user.setUsername("lili");
//        user.setSex("男");
//
//        User list = userService.login(user);
//        System.out.println(list.toString());

        userDao.findAll();
    }

    @Test
    public void run() throws IOException {
        InputStream input = Resources.getResourceAsStream("user.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
        SqlSession session = sqlSessionFactory.openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> lists = userDao.findAll();
        for(User a: lists){
            System.out.println(a.toString());;
        }
    }
}
