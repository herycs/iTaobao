package com.w.service;

import com.w.domain.OrderForm;

import java.util.List;

/**
 * @author ming
 */
public interface OrderFormService {
    public  int addOrderForm(OrderForm orderForm);
    public  int deleteOrderForm(int orderID);
    public  int updateOrderForm(OrderForm orderForm);
    public List<OrderForm> findAll();
    public  List<OrderForm> findOrderFormByID(int orderID);
}
