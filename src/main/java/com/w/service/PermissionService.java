package com.w.service;

import com.w.domain.Permission;

import java.util.List;

/**
 * @author ming
 */
public interface PermissionService {
    public  int addPermission(Permission permission);
    public  int deletePermission(String permissionID);
    public  int updatePermission(Permission permission);
    public List<Permission> findOneByID(String permissionID);
    public   List<Permission> findAll();
}
