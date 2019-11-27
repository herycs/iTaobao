package com.w.service.impl;

import com.w.dao.OrderFormDao;
import com.w.domain.OrderForm;
import com.w.service.OrderFormService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName OrderFormServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/17 21:04
 * @Version V1.0
 **/
@Service("orderFormService")
public class OrderFormServiceImpl implements OrderFormService {

    @Autowired
    private OrderFormDao orderFormDao;

    @Override
    public  int addOrderForm(OrderForm orderForm){
        int result = orderFormDao.addOrderForm(orderForm);
        return result;
    }

    @Override
    public  int deleteOrderForm(int orderID){
        int result1 = orderFormDao.deleteOrderForm(orderID);
        return result1;
    }

    @Override
    public  int updateOrderForm( OrderForm orderForm){
        int result2 = orderFormDao.updateOrderForm(orderForm);
        return result2;
    }

    @Override
    public List<OrderForm> findAll(){
        List<OrderForm> orderFormList = orderFormDao.findAll();
        return  orderFormList;
    }

    @Override
    public  List<OrderForm> findOrderFormByID(int orderID){
        List<OrderForm> orderFormList1 = orderFormDao.findOrderFormByID(orderID);
        return orderFormList1;
    }

}
