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
}
