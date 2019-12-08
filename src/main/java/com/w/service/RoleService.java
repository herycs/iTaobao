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
    int addRole(Role role) throws Exception;
    int deleRole(int roleID) throws Exception;
    List<Role> findAll() throws Exception;
    List<Role> findfindRoleByUserID(int userID) throws Exception;

    int updateRole(Role role) throws Exception;
}
