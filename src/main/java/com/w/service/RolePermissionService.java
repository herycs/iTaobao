package com.w.service;

import com.w.domain.RolePermission;

import java.util.List;

/**
 * @ClassNameRoleRolePremissionService
 * @Description
 * @Author ANGLE0
 * @Date2019/11/20 20:35
 * @Version V1.0
 **/
public interface RolePermissionService {
    int addRolePremission(RolePermission rolePermission);
    int deleteRolePremission(int rolePermissionID);
    int updateRolePremission(RolePermission rolePermission);
    List<RolePermission> findAll();
}
