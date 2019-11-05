package com.w.test;

import com.w.dao.IUserDao;
import com.w.dao.RoleDao;
import com.w.domain.IUser;
import com.w.domain.Role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

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

    @Test
    public void run2() throws Exception {
        InputStream input = Resources.getResourceAsStream("user.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
        SqlSession session = sqlSessionFactory.openSession();

        IUserDao iUserDao = session.getMapper(IUserDao.class);
        IUser iUser = new IUser();

        iUser.setUsername("lili");
        iUser.setPassword("123");

        iUserDao.save(iUser);

    }

    @Test
    public void run3() throws IOException {
        InputStream input = Resources.getResourceAsStream("user.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
        SqlSession session = sqlSessionFactory.openSession();
        IUserDao iUserDao = (IUserDao) session.getMapper(IUserDao.class);

        List userList = iUserDao.findAll();

        for(Object a: userList){
            System.out.println(a.toString());;
        }
    }

    @Test
    public void run4() throws IOException {
        InputStream input = Resources.getResourceAsStream("user.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
        SqlSession session = sqlSessionFactory.openSession();
        IUserDao iUserDao = (IUserDao) session.getMapper(IUserDao.class);

        IUser iUser = new IUser();
        iUser.setPassword("111");
        iUser.setUsername("123");
        int i = iUserDao.updateUser(iUser);
        session.commit();
        System.out.println(i);
    }
}
