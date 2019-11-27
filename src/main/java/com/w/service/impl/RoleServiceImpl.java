package com.w.service.impl;

import com.w.dao.RoleDao;
import com.w.domain.Role;
import com.w.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNameRoleServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/10/27 16:13
 * @Version V1.0
 **/
@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public int addRole(Role role) {
        int result = roleDao.addRole(role);
        return result;
    }

    @Override
    public int deleRole(int roleID) {
        int result = roleDao.deleteRole(roleID);
        return result;
    }

    @Override
    public List<Role> findAll() {
        List<Role> lists = roleDao.findAllRole();
        return lists;
    }

    @Override
    public List<Role> findfindRoleByUserID(int userID) {
        List<Role> lists = roleDao.findAllRole();
        return lists;
    }

    @Override
    public int updateRole(Role role) {
        return roleDao.updateRole(role);
    }
}