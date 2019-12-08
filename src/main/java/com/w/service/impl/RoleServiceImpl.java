package com.w.service.impl;

import com.w.dao.RoleDao;
import com.w.dao.UserRoleDao;
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
    public int addRole(Role role) throws Exception{
        int result = roleDao.addRole(role);
        return result;
    }

    @Override
    public int deleRole(int roleID) throws Exception{
        int result = roleDao.deleteRole(roleID);
        return result;
    }

    @Override
    public List<Role> findAll() throws Exception{
        List<Role> lists = roleDao.findAllRole();
        return lists;
    }

    @Override
    public List<Role> findfindRoleByUserID(int userID) throws Exception{
        List<Role> lists = roleDao.findAllRole();
        return lists;
    }

    @Override
    public int updateRole(Role role) throws Exception{
        return roleDao.updateRole(role);
    }
}