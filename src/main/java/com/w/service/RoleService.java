package com.w.service;

import com.w.domain.Role;

import java.util.List;

/**
 * @ClassNameRoleService
 * @Description
 * @Author ANGLE0
 * @Date2019/10/27 16:12
 * @Version V1.0
 **/
public interface RoleService {
    int addRole(Role role);
    int deleRole(int roleID);
    List<Role> findAll();
    List<Role> findfindRoleByUserID(int userID);

    int updateRole(Role role);
}
