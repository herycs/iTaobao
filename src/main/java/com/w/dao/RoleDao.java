package com.w.dao;

import com.w.domain.Role;
import org.apache.ibatis.annotations.*;

import java.sql.SQLException;
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
    List<Role> findRolesByID(Integer userID) throws SQLException;

    @Select("select * from role")
    List<Role> findAllRole() throws SQLException;

    @Insert("insert into role(roleName, role_name, role_type, roleDescribe, roleCreaterID, roleCreateTime, modifier_id, modifier_time, orgid) " +
            "values(" +
            "#{role.roleName}," +
            "#{role.role_name}," +
            "#{role.role_type}," +
            "#{role.roleDescribe}," +
            "#{role.roleCreaterID}," +
            "#{role.roleCreateTime}," +
            "#{role.modifier_id}," +
            "#{role.modifier_time}," +
            " #{role.orgid}" +
            ")")
    int addRole(@Param("role") Role role) throws SQLException;

    @Delete("delete from role where roleID = #{roleID}")
    int deleteRole(int roleID) throws SQLException;

    @Update("update role set " +
            "roleName = #{role.roleName}," +
            "roleName = #{role.role_name}," +
            "roleName = #{role.role_type}," +
            "roleName = #{role.roleDescribe}," +
            "roleName = #{role.roleCreaterID}," +
            "roleName = #{role.roleCreateTime}," +
            "roleName = #{role.modifier_id}," +
            "roleName = #{role.modifier_time}," +
            " roleDescribe = #{role.orgid} " +
            "where roleID = #{role.roleID}")
    int updateRole(@Param("role") Role role) throws SQLException;
}
