package com.w.service;

import com.w.domain.OrderDetail;

import java.util.List;

/**
 * @author ming
 */
public interface OrderDetailService {
    public int addOrderDetail(OrderDetail orderDetail);
    public int deleteOrderDatail(OrderDetail orderDetail);
    public  int  updateOrderDetail(OrderDetail orderDetail);
    public List<OrderDetail> findAll(String orderDetailID);
    public   List<OrderDetail> findOne(String orderDetailID);
}
