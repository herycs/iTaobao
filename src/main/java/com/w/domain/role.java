package com.w.domain;

import org.apache.ibatis.annotations.Insert;

import java.util.List;

/**
 * @ClassNamerole
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:05
 * @Version V1.0
 **/

//create table role
//        (
//        roleID               varchar(50) not null,
//        roleName             varchar(20),
//        roleDescribe         varchar(50),
//        primary key (roleID)
//        );

public class Role{

    private Integer roleID;
    private String roleName;
    private String roleDescribe;
    private List<Permission> permissionList;
    private List<IUser> IUserList;

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescribe() {
        return roleDescribe;
    }

    public void setRoleDescribe(String roleDescribe) {
        this.roleDescribe = roleDescribe;
    }

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    public List<IUser> getIUserList() {
        return IUserList;
    }

    public void setIUserList(List<IUser> IUserList) {
        this.IUserList = IUserList;
    }
}
