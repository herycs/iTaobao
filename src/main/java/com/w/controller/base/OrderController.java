package com.w.controller.base;

import com.w.domain.OrderForm;
import com.w.service.OrderFormService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.OrderComparator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassNameOrderController
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 9:07
 * @Version V1.0
 **/
@Controller
@RequestMapping("/order")
public class OrderController {
    
    @Autowired
    private OrderFormService orderFormService;

    @RequestMapping("/update.do")
    public String updateOrder(OrderForm orderForm){
        int result = orderFormService.updateOrderForm(orderForm);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/add.do")
    public String addOrder(OrderForm orderForm){
        int result = orderFormService.addOrderForm(orderForm);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/del.do")
    public String deleteOrder(int orderID){
        int result = orderFormService.deleteOrderForm(orderID);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public List<OrderForm> findAll(){
        List OrderList = orderFormService.findAll();
        return OrderList;
    }
}
