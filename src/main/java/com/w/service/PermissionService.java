package com.w.service;

import com.w.domain.Permission;

import java.util.List;

/**
 * @author ming
 */
public interface PermissionService {
    public  int addPermission(Permission permission);
    public  int deletePermission(int permissionID);
    public  int updatePermission(Permission permission);
    public List<Permission> findOneByID(int permissionID);
    public   List<Permission> findAll();
}
