package com.w.domain;

import java.io.Serializable;
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

public class Role implements Serializable {

    private String roleID;
    private String roleName;
    private String roleDescribe;
    private List<Permission> permissionList;
    private List<UserInfo> userInfoList;

    public List<UserInfo> getUserInfoInfoList() {
        return userInfoInfoList;
    }

    public void setUserInfoInfoList(List<UserInfo> userInfoInfoList) {
        this.userInfoInfoList = userInfoInfoList;
    }

    private List<UserInfo> userInfoInfoList;

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
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

    public List<UserInfo> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<UserInfo> userInfoList) {
        this.userInfoList = userInfoList;
    }
    @Override
    public String toString() {
        return "Role{" +
                "roleID='" + roleID + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleDescribe='" + roleDescribe + '\'' +
                ", permissionList=" + permissionList +
                ", userInfoList=" + userInfoList +
                ", userInfoInfoList=" + userInfoInfoList +
                '}';
    }
}
