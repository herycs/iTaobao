package com.w.dao;

import com.w.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassNameRoleDao
 * @Description
 * @Author ANGLE0
 * @Date2019/10/26 20:17
 * @Version V1.0
 **/
public interface RoleDao {
//    查询
    @Select("select * from role where roleID in " +
            "(select roleID from user_role where userID = #{userID})")
    List<Role> findRolesByID(Integer userID);

    @Select("select * from role")
    List<Role> findAllRole();

    @Insert("insert into role(roleName, roleDescribe) values(#{role.roleName}, #{role.roleDescribe})")
    int addRole(@Param("role") Role role);

    @Delete("delete from role where roleID = #{roleID}")
    int deleteRole(int roleID);

    @Update("update role set roleName = #{role.roleName}, roleDescribe = #{role.roleDescribe} where roleID = #{role.roleID}")
    int updateRole(@Param("role") Role role);
}
