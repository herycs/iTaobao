package com.w.domain;

/**
 * @ClassNameUser_Role
 * @Description
 * @Author ANGLE0
 * @Date2019/10/27 14:52
 * @Version V1.0
 **/

//create table user_role
//        (
//        userID               int,
//        roleID               varchar(50)
//        );

public class UserRole {

    Integer user_roleID;
    Integer userID;
    String roleID;

    public Integer getUser_roleID() {
        return user_roleID;
    }

    public void setUser_roleID(Integer user_roleID) {
        this.user_roleID = user_roleID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }
}
