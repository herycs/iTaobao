package com.w.controller.base;

import com.w.domain.OrderForm;
import com.w.service.OrderFormService;
import com.w.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
@Controller
@RequestMapping("/order")
public class OrderController {
    
    @Autowired
    private OrderFormService orderFormService;

    @RequestMapping("/update.do")
    @ResponseBody
    public JsonData updateOrder(OrderForm orderForm){
        int result = orderFormService.updateOrderForm(orderForm);
        if(result == 1){
            return JsonData.getUpdateSuccessData();
        }
        return JsonData.getUpdateFailedData();
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public JsonData addOrder(OrderForm orderForm){
        int result = orderFormService.addOrderForm(orderForm);
        if (result == 1){
            return JsonData.getAddSuccessData();
        }
        return JsonData.getAddFailedData();
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public JsonData deleteOrder(int orderID){
        int result = orderFormService.deleteOrderForm(orderID);
        if (result == 1){
            return JsonData.getDeleteSuccessData();
        }
        return JsonData.getDeleteFailedData();
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public JsonData findAll(){
        List orderList = orderFormService.findAll();
        return JsonData.getJsonData(new JsonData(0, "获取数据成功", orderList));
    }
}
