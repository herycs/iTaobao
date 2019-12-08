package com.w.service;

import com.w.domain.Permission;

import java.util.List;

/**
 * @author ming
 */
public interface PermissionService {
    public  int addPermission(Permission permission) throws Exception;
    public  int deletePermission(int permissionID) throws Exception;
    public  int updatePermission(Permission permission) throws Exception;
    public List<Permission> findOneByID(int permissionID) throws Exception;
    public   List<Permission> findAll() throws Exception;
}
