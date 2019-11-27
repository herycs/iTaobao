package com.w.dao;

import com.w.domain.OrderForm;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassNameorderForm
 * @Description
 * @Author ANGLE0
 * @Date2019/10/31 8:27
 * @Version V1.0
 **/
@Repository
public interface OrderFormDao {

    //add
    @Insert("insert into orderform(order_detail_ID, money, createTime, payTime, orderStatus) " +
            "values(" +
                "#{orderForm.order_detail_ID}," +
                "#{orderForm.money}," +
                "#{orderForm.createTime}," +
                "#{orderForm.payTime}," +
                "#{orderForm.orderStatus}" +
            ")")
    int addOrderForm(@Param("orderForm")OrderForm orderForm);

    //delete
    @Delete("delete from orderform where orderID = #{orderID}")
    int deleteOrderForm(int orderID);

    //update
    @Update("update orderform set " +
                "order_detail_ID = #{orderForm.order_detail_ID}," +
                "money = #{orderForm.money}," +
                "createTime = #{orderForm.createTime}," +
                "payTime = #{orderForm.payTime}," +
                "orderStatus = #{orderForm.orderStatus}" +
                " where orderID = #{orderForm.orderID}" +
            ")")
    int updateOrderForm(@Param("orderForm") OrderForm orderForm);

    //select
    @Select("select * from orderform")
    List<OrderForm> findAll();

    @Select("select from orderform = where orderID = #{orderID}")
    List<OrderForm> findOrderFormByID(int orderID);
}
