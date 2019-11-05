package com.w.domain;

/**
 * @ClassNamePro_detail
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:05
 * @Version V1.0
 **/

//create table pro_detail
//        (
//        detail_ID            int not null comment '折扣详情，针对什么商品，达到什么要求，折扣多少',
//        pro_ID               int,
//        detail_data           varchar(100),
//        detail_class         char(1),
//        primary key (detail_ID)
//        );

public class ProDetail {

    Integer detail_ID;
    Integer pro_ID;
    String detail_data;
    String detail_class;

    public Integer getDetail_ID() {
        return detail_ID;
    }

    public void setDetail_ID(Integer detail_ID) {
        this.detail_ID = detail_ID;
    }

    public Integer getPro_ID() {
        return pro_ID;
    }

    public void setPro_ID(Integer pro_ID) {
        this.pro_ID = pro_ID;
    }

    public String getDetail_data() {
        return detail_data;
    }

    public void setDetail_data(String detail_data) {
        this.detail_data = detail_data;
    }

    public String getDetail_class() {
        return detail_class;
    }

    public void setDetail_class(String detail_class) {
        this.detail_class = detail_class;
    }
}
