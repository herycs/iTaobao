package com.w.dao;

import com.w.domain.RolePermission;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassNameRolePremissionDao
 * @Description
 * @Author ANGLE0
 * @Date2019/10/31 8:31
 * @Version V1.0
 **/
public interface RolePremissionDao {

    //增加用户权限绑定
    @Insert("insert into role_premission(roleID, permissionID) values(#{rolePremission.roleID}, #{rolePremission.permissionID})")
    int addPremissionForUser(@Param("rolePremission") RolePermission rolePermission);

    //删除用户权限绑定
    @Delete("delete from role_premission where roleID = #{rolePremission.roleID}")
    int removePremissionFromUser(@Param("rolePremission") int rolePermission);

    //查找用户权限
    @Select("select * from role_premission")
    List<RolePermission> findAllPremission();

}
