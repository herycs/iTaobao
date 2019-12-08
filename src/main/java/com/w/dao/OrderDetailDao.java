package com.w.dao;

import com.w.domain.OrderDetail;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassNameOrderDetailDao
 * @Description
 * @Author ANGLE0
 * @Date2019/10/31 8:27
 * @Version V1.0
 **/
@Repository
public interface OrderDetailDao {

    //insert
    @Insert("insert into orderDetail(userID, pro_ID, bus_ID, buy_num)" +
            "values(" +
            "#{orderDetail}.userID, " +
            "#{orderDetail}.pro_ID, " +
            "#{orderDetail}.bus_ID, " +
            "#{orderDetail}.buy_num")
    int addOrderDetail(OrderDetail orderDetail) throws SQLException;

    //delete
    @Delete("delete from where order_detail_ID = #{orderDetail}.order_detail_ID")
    int deleteOrderDatail(@Param("orderDetail")OrderDetail orderDetail) throws SQLException;

    //update
    @Update("update orderDetail set " +
            "userID = #{orderDetail}.userID," +
            "pro_ID = #{orderDetail}.pro_ID," +
            "bus_ID = #{orderDetail}.bus_ID," +
            "buy_num = #{orderDetail}.buy_num where" +
            "order_detail_ID = #{orderDetail}.order_detail_ID")
    int updateOrderDetail(@Param("orderDetail")OrderDetail orderDetail) throws SQLException;

    //find
    @Select("select * from orderDetail")
    List<OrderDetail> findAll(String orderDetailID) throws SQLException;
    @Select("select * from orderDetail where order_detail_ID = #{orderDetailID}")
    List<OrderDetail> findOne(String orderDetailID) throws SQLException;
}
