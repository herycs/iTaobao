package com.w.service.impl;

import com.w.dao.PermissionDao;
import com.w.domain.Permission;
import com.w.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName PermissionServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/17 21:04
 * @Version V1.0
 **/
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService{

    @Autowired
    private PermissionDao permissionDao;

    @Override
    public  int addPermission(Permission permission) throws Exception{
        int result = permissionDao.addPermission(permission);
        return result;
    }
    @Override
    public  int deletePermission(int permissionID) throws Exception{
        int result1 = permissionDao.deletePermission(permissionID);
        return result1;
    }
    @Override
    public  int updatePermission(Permission permission) throws Exception{
        int result2 = permissionDao.updatePermission(permission);
        return result2;
    }
    @Override
    public List<Permission> findOneByID(int permissionID) throws Exception{
        List<Permission> permissionList = permissionDao.findOneByID(permissionID);
        return permissionList;
    }
    @Override
    public   List<Permission> findAll() throws Exception{
        List<Permission> permissionList1 = permissionDao.findAll();
        return permissionList1;
    }
}
