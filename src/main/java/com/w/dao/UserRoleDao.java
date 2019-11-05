package com.w.dao;

import org.apache.ibatis.annotations.Insert;

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

}
