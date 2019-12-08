package com.w.test;

import com.w.dao.IUserDao;
import com.w.domain.IUser;
import com.w.util.JedisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import redis.clients.jedis.Jedis;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @ClassNameRedisTest
 * @Description
 * @Author ANGLE0
 * @Date2019/11/25 19:56
 * @Version V1.0
 **/
public class RedisTest {

    private IUserDao iUserDao;

    public static void main(String[] args) throws IOException, SQLException {
        RedisTest redisTest = new RedisTest();
        List list = redisTest.findALL();
        System.out.println(list.toArray());
    }

    public List<IUser> findALL() throws IOException, SQLException {
        InputStream input = Resources.getResourceAsStream("user.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
        SqlSession session = sqlSessionFactory.openSession();
        iUserDao = (IUserDao)session.getMapper(IUserDao.class);

        Jedis jedis = JedisUtil.getJedis();

        Set<String> users = jedis.zrange("users", 0, -1);
        List<IUser> userlist = null;

        if (users == null || users.size() == 0) {
            userlist = iUserDao.findAll();
            for (int i = 0; i < userlist.size(); i++) {
                jedis.zadd("users", userlist.get(i).getUserID(), userlist.get(i).getUsername());
            }
        }else{
            userlist = new ArrayList<IUser>();
            for (String name : users){
                IUser iUser = new IUser();
                iUser.setUsername(name);
                userlist.add(iUser);
            }
        }
        return userlist;
    }

}
