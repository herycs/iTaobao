package com.w.domain;

/**
 * @ClassNameManager
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:04
 * @Version V1.0
 **/

//create table manager
//        (
//        man_ID               int not null,
//        man_username         varchar(25),
//        man_name             varchar(200),
//        man_password         varchar(30),
//        primary key (man_ID)
//        );
public class Manager {

    Integer man_ID;
    String man_username;
    String man_name;
    String man_password;

    public Integer getMan_ID() {
        return man_ID;
    }

    public void setMan_ID(Integer man_ID) {
        this.man_ID = man_ID;
    }

    public String getMan_username() {
        return man_username;
    }

    public void setMan_username(String man_username) {
        this.man_username = man_username;
    }

    public String getMan_name() {
        return man_name;
    }

    public void setMan_name(String man_name) {
        this.man_name = man_name;
    }

    public String getMan_password() {
        return man_password;
    }

    public void setMan_password(String man_password) {
        this.man_password = man_password;
    }
}
