package com.w.service.impl;

import com.w.dao.UserRoleDao;
import com.w.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;

/**
 * @ClassNameUserRoleServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/12/6 22:36
 * @Version V1.0
 **/
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public int addRoleForUser(int userID, int roleID) throws SQLException {
        return userRoleDao.addRoleForUser(userID, roleID);
    }
}
