package com.w.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.annotations.Insert;
import org.springframework.format.annotation.DateTimeFormat;

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
//        roleID               int not null auto_increment,
//        roleName             varchar(20),
//        role_name            varchar(20),
//        role_type            varchar(20),
//        roleDescribe         varchar(500),
//        roleCreaterID        int,
//        roleCreateTime       datetime,
//        modifier_id          int,
//        modifier_time        datetime,
//        orgid                char(1),
//        primary key (roleID)
//        );

public class Role{

    private Integer roleID;
    private String roleName;
    private String role_name;
    private String role_type;
    private String roleDescribe;
    private String roleCreaterID;
    @JsonFormat(locale = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String roleCreateTime;
    private String modifier_id;
    private String modifier_time;
    private String orgid;
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

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_type() {
        return role_type;
    }

    public void setRole_type(String role_type) {
        this.role_type = role_type;
    }

    public String getRoleDescribe() {
        return roleDescribe;
    }

    public void setRoleDescribe(String roleDescribe) {
        this.roleDescribe = roleDescribe;
    }

    public String getRoleCreaterID() {
        return roleCreaterID;
    }

    public void setRoleCreaterID(String roleCreaterID) {
        this.roleCreaterID = roleCreaterID;
    }

    public String getRoleCreateTime() {
        return roleCreateTime;
    }

    public void setRoleCreateTime(String roleCreateTime) {
        this.roleCreateTime = roleCreateTime;
    }

    public String getModifier_id() {
        return modifier_id;
    }

    public void setModifier_id(String modifier_id) {
        this.modifier_id = modifier_id;
    }

    public String getModifier_time() {
        return modifier_time;
    }

    public void setModifier_time(String modifier_time) {
        this.modifier_time = modifier_time;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
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
