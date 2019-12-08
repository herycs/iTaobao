package com.w.service.impl;

import com.w.dao.RolePremissionDao;
import com.w.domain.RolePermission;
import com.w.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import java.util.List;

/**
 * @ClassNameRolePermissionServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/20 20:53
 * @Version V1.0
 **/
@Service("rolePermission")
public class RolePermissionServiceImpl implements RolePermissionService {

    @Autowired
    private RolePremissionDao rolePermissionDao;

    @Override
    public int addRolePremission(RolePermission rolePermission) throws Exception{
        int result = rolePermissionDao.addPremissionForUser(rolePermission);
        return result;
    }

    @Override
    public int deleteRolePremission(int rolePermissionID) throws Exception{
        int result = rolePermissionDao.removePremissionFromUser(rolePermissionID);
        return result;
    }

    @Override
    public int updateRolePremission(RolePermission rolePermission) throws Exception{
        return 0;
    }

    @Override
    public List<RolePermission> findAll() throws Exception{
        List<RolePermission> lists = rolePermissionDao.findAllPremission();
        return lists;
    }
}
