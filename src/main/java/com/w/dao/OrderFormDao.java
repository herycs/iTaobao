package com.w.dao;

import com.w.domain.OrderForm;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassNameOrderFormDao
 * @Description
 * @Author ANGLE0
 * @Date2019/10/31 8:27
 * @Version V1.0
 **/
@Repository
public interface OrderFormDao {

    //add
    @Insert("insert into orderForm(order_detail_ID, money, createTime, payTime, orderStatus) values(" +
            "order_detail_ID = #{orderFormDao}.order_detail_ID," +
            "money = #{orderFormDao}.money," +
            "createTime = #{orderFormDao}.createTime," +
            "payTime = #{orderFormDao}.payTime," +
            "orderStatus = #{orderFormDao}.orderStatus")
    int addOrderForm(OrderForm orderForm);

    //delete
    @Delete("delete from orderForm where orderID = #{orderID}")
    int deleteOrderForm(String orderID);

    //update
    @Update("update orderForm set " +
            "order_detail_ID = #{orderFormDao}.order_detail_ID," +
            "money = #{orderFormDao}.money," +
            "createTime = #{orderFormDao}.createTime," +
            "payTime = #{orderFormDao}.payTime," +
            "orderStatus = #{orderFormDao}.orderStatus")
    int updateOrderForm(OrderForm orderForm);

    //select
    @Select("select * from orderForm")
    List<OrderForm> findAll();
    @Select("select from orderForm = where orderID = #{orderID}")
    List<OrderForm> findOrderFormByID(String orderID);
}
