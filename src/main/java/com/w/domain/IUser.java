package com.w.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * @ClassNameUser
 * @Description
 * @Author ANGLE0
 * @Date2019/10/18 8:53
 * @Version V1.0
 **/

//create table user
//        (
//        userID               int not null auto_increment,
//        username             varchar(30),
//        password             varchar(100),
//        sex                  char(1),
//        birthday             date,
//        telephone            varchar(18),
//        email                varchar(35),
//        status               char(1),
//        code                 varchar(100),
//        image                varchar(100),
//        primary key (userID)
//        );

public class IUser {

    private Integer userID;
    private String username;
    private String password;
    private String sex;
    @JsonFormat(pattern = "yyyy-MM-dd")//用于转换数据库读取数据
    @DateTimeFormat(pattern = "yyyy-MM-dd")//用于格式化前台传输的数据
    private Date birthday;
    private String telephone;
    private String email;
    private Integer status;
    private String code;
    private String image;
    private List<Role> roles;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
