package com.w.domain;

/**
 * @ClassNameRole_premission
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:07
 * @Version V1.0
 **/

//create table role_premission
////        (
////        role_per_ID          int not null,
////        roleID               varchar(50),
////        permissionID         int,
////        role_id              varchar(50),
////        permission_id        varchar(50),
////        primary key (role_per_ID)
////        );
public class Role_premission {

    Integer role_per_ID;
    String roleID;
    Integer permissionID;
    String role_id;
    String permission_id;

    public Integer getRole_per_ID() {
        return role_per_ID;
    }

    public void setRole_per_ID(Integer role_per_ID) {
        this.role_per_ID = role_per_ID;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public Integer getPermissionID() {
        return permissionID;
    }

    public void setPermissionID(Integer permissionID) {
        this.permissionID = permissionID;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(String permission_id) {
        this.permission_id = permission_id;
    }
}
