package com.w.domain;

/**
 * @ClassNameRole_premission
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:07
 * @Version V1.0
 **/

//create table role_premission
//        (
//        role_preID           int not null,
//        roleID               int,
//        permissionID         int,
//        primary key (role_preID)
//);
public class RolePermission {

    Integer role_preID;
    Integer roleID;
    Integer permissionID;

    public Integer getRole_preID() {
        return role_preID;
    }

    public void setRole_preID(Integer role_preID) {
        this.role_preID = role_preID;
    }

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

    public Integer getPermissionID() {
        return permissionID;
    }

    public void setPermissionID(Integer permissionID) {
        this.permissionID = permissionID;
    }
}
