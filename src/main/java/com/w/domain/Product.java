package com.w.domain;

import java.io.Serializable;

/**
 * @ClassNameProduct
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:05
 * @Version V1.0
 **/

//create table product
//        (
//        pro_ID               int not null,
//        pro_name             varchar(50),
//        pro_img              varchar(100),
//        pro_price            float(2),
//        pro_Info             varchar(200),
//        pro_explain          varchar(100),
//        pro_status           char(1) comment '2在售
//        1待售
//        0预购
//        -1缺货
//        -2下架',
//        primary key (pro_ID)
//        );

public class Product implements Serializable {

    Integer pro_ID;
    String pro_name;
    String pro_img;
    Float pro_price;
    String pro_Info;
    String pro_explain;
    Integer pro_status;

    public Integer getPro_ID() {
        return pro_ID;
    }

    public void setPro_ID(Integer pro_ID) {
        this.pro_ID = pro_ID;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getPro_img() {
        return pro_img;
    }

    public void setPro_img(String pro_img) {
        this.pro_img = pro_img;
    }

    public Float getPro_price() {
        return pro_price;
    }

    public void setPro_price(Float pro_price) {
        this.pro_price = pro_price;
    }

    public String getPro_Info() {
        return pro_Info;
    }

    public void setPro_Info(String pro_Info) {
        this.pro_Info = pro_Info;
    }

    public String getPro_explain() {
        return pro_explain;
    }

    public void setPro_explain(String pro_explain) {
        this.pro_explain = pro_explain;
    }

    public Integer getPro_status() {
        return pro_status;
    }

    public void setPro_status(Integer pro_status) {
        this.pro_status = pro_status;
    }

}
