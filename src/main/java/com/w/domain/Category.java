package com.w.domain;

/**
 * @ClassNameCategory
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:02
 * @Version V1.0
 **/

//create table category
//        (
//        cate_ID              int not null,
//        pro_ID               int,
//        cate_name            varchar(20),
//        primary key (cate_ID)
//        );

public class Category {

    Integer cate_ID;
    Integer pro_ID;
    String cate_name;

    public Integer getCate_ID() {
        return cate_ID;
    }

    public void setCate_ID(Integer cate_ID) {
        this.cate_ID = cate_ID;
    }

    public Integer getPro_ID() {
        return pro_ID;
    }

    public void setPro_ID(Integer pro_ID) {
        this.pro_ID = pro_ID;
    }

    public String getCate_name() {
        return cate_name;
    }

    public void setCate_name(String cate_name) {
        this.cate_name = cate_name;
    }
}
