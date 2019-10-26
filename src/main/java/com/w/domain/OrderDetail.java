package com.w.domain;

/**
 * @ClassNameOrderDetail
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:04
 * @Version V1.0
 **/

//create table orderDetail
//        (
//        order_detail_ID      int not null,
//        userID               int,
//        pro_ID               int,
//        bus_ID               int,
//        buy_num              int,
//        primary key (order_detail_ID)
//        );

public class OrderDetail {

    Integer order_detail_ID;
    Integer userID;
    Integer pro_ID;
    Integer bus_ID;
    Integer buy_num;

    public Integer getOrder_detail_ID() {
        return order_detail_ID;
    }

    public void setOrder_detail_ID(Integer order_detail_ID) {
        this.order_detail_ID = order_detail_ID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getPro_ID() {
        return pro_ID;
    }

    public void setPro_ID(Integer pro_ID) {
        this.pro_ID = pro_ID;
    }

    public Integer getBus_ID() {
        return bus_ID;
    }

    public void setBus_ID(Integer bus_ID) {
        this.bus_ID = bus_ID;
    }

    public Integer getBuy_num() {
        return buy_num;
    }

    public void setBuy_num(Integer buy_num) {
        this.buy_num = buy_num;
    }
}
