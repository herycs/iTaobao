package com.w.domain;

import java.util.List;

/**
 * @ClassNamePermission
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:04
 * @Version V1.0
 **/

//create table permission
//        (
//        permissionID         int not null,
//        permissionName       varchar(50),
//        permissionUrl        varchar(200),
//        primary key (permissionID)
//        );

public class Permission {

    private Integer permissionID;
    private String permissionName;
    private String permissionUrl;

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    private List<Role> roleList;

    public Integer getPermissionID() {
        return permissionID;
    }

    public void setPermissionID(Integer permissionID) {
        this.permissionID = permissionID;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
    }

}
