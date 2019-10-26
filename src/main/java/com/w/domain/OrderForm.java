package com.w.domain;

import org.aspectj.internal.lang.reflect.StringToType;

import java.util.Date;

/**
 * @ClassNameOrderForm
 * @Description
 * @Author ANGLE0
 * @Date2019/10/24 17:04
 * @Version V1.0
 **/

//create table orderForm
//        (
//        orderID              int not null,
//        order_detail_ID      int,
//        money                float(2),
//        createTime           datetime,
//        payTime              datetime,
//        orderStatus          char(1) comment '3表示已收货
//        2表示已发货
//        1表示成功
//        0表示未付款
//        -1表示失败
//        -2表示已退货
//        ',
//        primary key (orderID)
//        );

public class OrderForm {

    Integer orderID;
    Integer order_detail_ID;
    Float money;
    Date createTime;
    Date payTime;
    Integer orderStatus;

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getOrder_detail_ID() {
        return order_detail_ID;
    }

    public void setOrder_detail_ID(Integer order_detail_ID) {
        this.order_detail_ID = order_detail_ID;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }
}
