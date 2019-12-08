package com.w.service;

import com.w.domain.OrderDetail;

import java.util.List;

/**
 * @author ming
 */
public interface OrderDetailService {
    public int addOrderDetail(OrderDetail orderDetail) throws Exception;
    public int deleteOrderDatail(OrderDetail orderDetail) throws Exception;
    public  int  updateOrderDetail(OrderDetail orderDetail) throws Exception;
    public List<OrderDetail> findAll(String orderDetailID) throws Exception;
    public   List<OrderDetail> findOne(String orderDetailID) throws Exception;
}
