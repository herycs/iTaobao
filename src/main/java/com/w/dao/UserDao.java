package com.w.dao;

import com.w.domain.UserInfo;
import org.apache.ibatis.annotations.*;
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
    UserInfo IsUserExit(UserInfo userInfo);

    @Select("select * from user where username = #{name}")
    @Results({
            @Result(id=true,property = "userID",column = "userID"),
            @Result(property = "username",column = "username"),
            @Result(property = "password",column = "password"),
            @Result(property = "sex",column = "sex"),
            @Result(property = "birthday",column = "birthday"),
            @Result(property = "telephone",column = "telephone"),
            @Result(property = "email",column = "email"),
            @Result(property = "status",column = "status"),
            @Result(property = "roles",column = "userID",
                    javaType = java.util.List.class,
                    many = @Many(select="com.w.dao.RoleDao.findRolesByID")),
    })
    UserInfo findUserByName(String name);

//    查询指定用户
    @Select("select * from user where username = #{user.username} and password = #{user.password}")
    UserInfo findUser(UserInfo userInfo);

//    查询所有用户
    @Select("select * from user")
    List<UserInfo> findAll();

//    查询指定用户
    @Select("select * from user where telephone = #{user.telephone} or email = #{user.email}")
    List<UserInfo> findUserByTelephoneOrEmail();
    @Select("select * from user where code = #{activeCode}")
    UserInfo findByActiveCode(String activeCode);

//    添加用户
    @Insert("insert into user(username, password, sex, birthday, telephone, email, status, code) values(#{user.username}, #{user.password}, #{user.sex}, #{user.birthday}, #{user.telephone}, #{user.email}, #{user.status},#{user.code})")
    int save(UserInfo userInfo);

//    更新用户信息
    @Update("update user set username = #{user.username} ,password = #{user.password}, sex = #{user.sex}, birthday = #{birthday}, telephone = #{telephone}, email = {user.email}")
    int updateUser(UserInfo userInfo);

//    修改手机号及密码
    @Update("update user set password = #{password} where telephone = #{telephone} and email = #{email}")
    int updatePassword(String telephone, String password);

//    用户激活
    @Update("update user set status = 1 where code = #{activeCode}")
    int active(String activeCode);

//    删除用户
    @Update("delete from user where username = #{user.username} and password = #{user.password} and email = {user.email}")
    int deleteUser(UserInfo userInfo);
}
