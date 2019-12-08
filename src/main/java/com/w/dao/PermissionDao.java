package com.w.dao;

import com.w.domain.Permission;
import org.apache.ibatis.annotations.*;
import org.springframework.security.core.parameters.P;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassNamePermission
 * @Description
 * @Author ANGLE0
 * @Date2019/10/31 8:28
 * @Version V1.0
 **/
public interface PermissionDao {
    //add
    @Insert("insert into permission(permissionName, permissionUrl)" +
            " values(" +
            "#{permission.permissionName}" +
            ", #{permission.permissionUrl}" +
            ")")
    int addPermission(@Param("permission")Permission permission) throws SQLException;

    //delete
    @Delete("delete from permission where permissionID = #{permissionID}")
    int deletePermission(int permissionID) throws SQLException;

    //update
    @Update("update permission set " +
            "permissionName = #{permission.permissionName}," +
            " permissionUrl = #{permission.permissionUrl}" +
            "where permissionID = #{permission.permissionID}")
    int updatePermission(@Param("permission")Permission permission) throws SQLException;

    //select
    @Select("select * form permission where permissionID = #{permission.permissionID}")
    List<Permission> findOneByID(int permissionID) throws SQLException;
    @Select("select * from permission")
    List<Permission> findAll() throws SQLException;
}
