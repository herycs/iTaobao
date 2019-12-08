package com.w.service;

import com.w.domain.OrderForm;

import java.util.List;

/**
 * @author ming
 */
public interface OrderFormService {
    public  int addOrderForm(OrderForm orderForm) throws Exception;
    public  int deleteOrderForm(int orderID) throws Exception;
    public  int updateOrderForm(OrderForm orderForm) throws Exception;
    public List<OrderForm> findAll() throws Exception;
    public  List<OrderForm> findOrderFormByID(int orderID) throws Exception;
}
