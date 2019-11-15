package com.w.dao;

import com.w.domain.UserRole;
import org.apache.ibatis.annotations.*;

/**
 * @ClassNameUserRoleDao
 * @Description
 * @Author ANGLE0
 * @Date2019/10/31 8:32
 * @Version V1.0
 **/
public interface UserRoleDao {

    //为用户添加角色
    @Insert("insert into user_role(userID, roleID) values(#{userID}, #{userRole})")
    int addRoleForUser(int userID, int userRole);

    //修改用户角色
    @Update("update user_role set userID = #{userRole.userID}, roleID = #{userRole.roleID}")
    int updateRoleForUser(@Param("userRole") UserRole userRole);

    //移除用户角色
    @Delete("delete from user_role where userID = #{userID}")
    int removeRoleFromUser(int userID);

    //查找所有角色
    @Select("select * from user_role")
    int findAllRoles();

}
