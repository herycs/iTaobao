package com.w.domain;

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

    Integer permissionID;
    String permissionName;
    String permissionUrl;

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
