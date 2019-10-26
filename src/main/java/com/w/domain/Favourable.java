package com.w.domain;

/**
 * @ClassNameFavourable
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:03
 * @Version V1.0
 **/

//create table favourable
//        (
//        fav_ID               int not null,
//        pro_ID               int,
//        fav_name             varchar(10),
//        fav_price            float(2) comment '百分比：原价的多少
//        整数：抵消一定金额',
//        fav_method           int comment '3：优惠券
//        2：津贴
//        1：红包
//        ',
//        primary key (fav_ID)
//        );

public class Favourable {

    Integer fav_ID;
    Integer pro_ID;
    String fav_name;
    Float fav_price;
    Integer fav_method;

    public Integer getFav_ID() {
        return fav_ID;
    }

    public void setFav_ID(Integer fav_ID) {
        this.fav_ID = fav_ID;
    }

    public Integer getPro_ID() {
        return pro_ID;
    }

    public void setPro_ID(Integer pro_ID) {
        this.pro_ID = pro_ID;
    }

    public String getFav_name() {
        return fav_name;
    }

    public void setFav_name(String fav_name) {
        this.fav_name = fav_name;
    }

    public Float getFav_price() {
        return fav_price;
    }

    public void setFav_price(Float fav_price) {
        this.fav_price = fav_price;
    }

    public Integer getFav_method() {
        return fav_method;
    }

    public void setFav_method(Integer fav_method) {
        this.fav_method = fav_method;
    }
}
