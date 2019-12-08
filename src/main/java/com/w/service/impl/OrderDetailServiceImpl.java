package com.w.service.impl;

import com.w.dao.OrderDetailDao;
import com.w.domain.OrderDetail;
import com.w.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName OrderDetailServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/17 21:04
 * @Version V1.0
 **/
@Service("orderDetailsService")
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrderDetailDao orderDetailDao;

    @Override
    public int addOrderDetail(OrderDetail orderDetail) throws Exception{
        int result = orderDetailDao.addOrderDetail(orderDetail);
        return result;
    }

    @Override
    public int deleteOrderDatail(OrderDetail orderDetail) throws Exception{
        int result1 = orderDetailDao.deleteOrderDatail(orderDetail);
        return result1;
    }

    @Override
    public  int  updateOrderDetail(OrderDetail orderDetail) throws Exception{
        int result2 = orderDetailDao.updateOrderDetail(orderDetail);
        return result2;
    }

    @Override
    public List<OrderDetail> findAll(String orderDetailID) throws Exception{
        List<OrderDetail> orderDetailList = orderDetailDao.findAll(orderDetailID);
        return orderDetailList;
    }
    @Override
    public   List<OrderDetail> findOne(String orderDetailID) throws Exception{
        List<OrderDetail> orderDetailList1 = orderDetailDao.findOne(orderDetailID);
        return orderDetailList1;
    }

}
