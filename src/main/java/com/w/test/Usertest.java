package com.w.test;

import com.w.dao.RoleDao;
import com.w.dao.UserDao;
import com.w.domain.Role;
import com.w.domain.UserInfo;
import com.w.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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

    }

    @Test
    public void run() throws IOException {
        InputStream input = Resources.getResourceAsStream("user.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
        SqlSession session = sqlSessionFactory.openSession();
        RoleDao roleDao = (RoleDao) session.getMapper(RoleDao.class);

        List<Role> lists = roleDao.findRolesByID(1);
        for(Role a: lists){
            System.out.println(a.toString());;
        }
    }
}
