package com.w.domain;

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

public class role {

    String roleID;
    String roleName;
    String roleDescribe;

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
}
