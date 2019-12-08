package com.w.service;

import java.sql.SQLException;

/**
 * @ClassNameUserRoleService
 * @Description
 * @Author ANGLE0
 * @Date2019/12/6 22:35
 * @Version V1.0
 **/
public interface UserRoleService {
    int addRoleForUser(int userID, int roleID) throws SQLException;
}
