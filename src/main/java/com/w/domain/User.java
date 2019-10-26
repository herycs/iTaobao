package com.w.domain;

import java.util.Date;

/**
 * @ClassNameUser
 * @Description
 * @Author ANGLE0
 * @Date2019/10/18 8:53
 * @Version V1.0
 **/

//create table user
//        (
//        userID               int not null,
//        username             varchar(30),
//        password             varchar(30),
//        sex                  char(1),
//        birthday             date,
//        telephone            varchar(18),
//        email                varchar(35),
//        status               char(1),
//        code                 varchar(100),
//        primary key (userID)
//        );

public class User {

    private int userID;
    private String username;
    private String password;
    private String sex;
    private Date birthday;
    private String telephone;
    private String email;
    private String status;
    private String code;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
