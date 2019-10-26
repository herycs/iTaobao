package com.w.dao;

import com.w.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassNameUserDao
 * @Description
 * @Author ANGLE0
 * @Date2019/10/18 8:56
 * @Version V1.0
 **/
@Repository
public interface UserDao {
//    查询用户是否存在
    @Select("select * form user where username = #{user.username} and password = #{user.password}")
    User IsUserExit(User user);

    @Select("select * from user where username = #{name}")
    User findUserByName(String name);
//    查询指定用户
    @Select("select * from user where username = #{user.username} and password = #{user.password}")
    User findUser(User user);

//    查询所有用户
    @Select("select * from user")
    List<User> findAll();

//    查询指定用户
    @Select("select * from user where telephone = #{user.telephone} or email = #{user.email}")
    List<User> findUserByTelephoneOrEmail();
    @Select("select * from user where code = #{activeCode}")
    User findByActiveCode(String activeCode);

//    添加用户
    @Insert("insert into user(username, password, sex, birthday, telephone, email, status, code) values(#{user.username}, #{user.password}, #{user.sex}, #{user.birthday}, #{user.telephone}, #{user.email}, #{user.status},#{user.code})")
    int save(User user);

//    更新用户信息
    @Update("update user set username = #{user.username} ,password = #{user.password}, sex = #{user.sex}, birthday = #{birthday}, telephone = #{telephone}, email = {user.email}")
    int updateUser(User user);

//    修改手机号及密码
    @Update("update user set password = #{password} where telephone = #{telephone} and email = #{email}")
    int updatePassword(String telephone, String password);

//    用户激活
    @Update("update user set status = 1 where code = #{activeCode}")
    int active(String activeCode);

//    删除用户
    @Update("delete from user where username = #{user.username} and password = #{user.password} and email = {user.email}")
    int deleteUser(User user);
}
