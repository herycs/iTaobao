package com.w.dao;

import com.w.domain.IUser;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassNameUserDao
 * @Description
 * @Author ANGLE0
 * @Date2019/10/18 8:56
 * @Version V1.0
 **/
@Repository
public interface IUserDao {

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
    IUser findUserByName(String name) throws SQLException;

    @Select("select username, email from user where telephone = #{telephone}")
    IUser findUserNameAndEmailByPhone(String telephone);

//    查询指定用户
    @Select("select * from user where username = #{iUser.username} and password = #{iUser.password}")
    IUser findUser(@Param("iUser") IUser iUser) throws SQLException;

//    查询所有用户
    @Select("select * from user where status = 0 or status = 1")
    List<IUser> findAll() throws SQLException;

//    查询指定用户
    @Select("select * from user where telephone = #{iUser.telephone} or email = #{iUser.email}")
    List<IUser> findUserByTelephoneOrEmail() throws SQLException;
    @Select("select * from user where code = #{activeCode}")
    IUser findByActiveCode(String activeCode) throws SQLException;

//    添加用户
    @Insert("insert into user(username, password, sex, birthday, telephone, email, status, code, image) " +
            "values(" +
            "#{iUser.username}," +
            "#{iUser.password}, " +
            "#{iUser.sex}, " +
            "#{iUser.birthday}," +
            "#{iUser.telephone}," +
            "#{iUser.email}," +
            "#{iUser.status}, " +
            "#{iUser.code}," +
            "#{iUser.image}" +
            ")")
    int save(@Param("iUser") IUser iUser) throws SQLException;

//    更新用户信息
    @Update("update user set username = #{iUser.username} ,password = #{iUser.password}, sex = #{iUser.sex}, birthday = #{iUser.birthday}, telephone = #{iUser.telephone}, email = #{iUser.email} where userID = #{iUser.userID}")
    int updateUser(@Param("iUser") IUser iUser) throws SQLException;

//    修改手机号及密码
    @Update("update user set password = #{password} where telephone = #{telephone}")
    int updatePassword( @Param("password") String password, @Param("telephone") String telephone) throws SQLException;

//    用户激活
    @Update("update user set status = 1 where code = #{activeCode}")
    int active(String activeCode) throws SQLException;

//    删除用户
    @Update("delete from user where userID = #{userID}")
    int deleteRealUser(@Param("userID") int userID) throws SQLException;

    @Update("update user set status = 3 where userID = #{userID}")
    int deleteUser(@Param("userID") int userID) throws SQLException;
}
