package com.w.dao;

import com.w.domain.Permission;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.security.core.parameters.P;

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
    @Insert("insert into permission(permissionName, permissionUrl) values(#{permission}.permissionName, #{permission}.permissionUrl)")
    int addPermission(Permission permission);

    //delete
    @Delete("delete from permission where permissionID = #{permission}.permissionID")
    int deletePermission(Permission permission);

    //update
    @Update("update permission set " +
            "permissionName = #{permission}.permissionName," +
            " permissionUrl = #{permission}.permissionUrl" +
            "where permissionID = #{permission}.permissionID")
    int updatePermission(Permission permission);

    //select
    @Select("select * form permission where permissionID = #{permission}.permissionID")
    List<Permission> findOneByID(String permissionID);
    @Select("select * from permission")
    List<Permission> findAll();
}
