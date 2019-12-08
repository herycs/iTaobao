package com.w.controller;

import com.w.common.entity.StateCode;
import com.w.domain.OrderForm;
import com.w.service.OrderFormService;
import com.w.common.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

//    @RequestMapping("/update.do")
    @RequestMapping(value = "/{hisID}", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateOrder(@PathVariable("hisID") int hisID, @RequestBody OrderForm orderForm) throws Exception {
    orderForm.setOrderID(hisID);
        int result = orderFormService.updateOrderForm(orderForm);
        if(result == 1){
            return Result.getUpdateSuccessData();
        }
        return Result.getUpdateFailedData();
    }

//    @RequestMapping("/add.do")
    @RequestMapping( method = RequestMethod.POST)
    @ResponseBody
    public Result addOrder(@RequestBody OrderForm orderForm) throws Exception {
        int result = orderFormService.addOrderForm(orderForm);
        if (result == 1){
            return Result.getAddSuccessData();
        }
        return Result.getAddFailedData();
    }

//    @RequestMapping("/del.do")
    @RequestMapping(value = "/{orderID}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteOrder(@PathVariable("orderID") int orderID) throws Exception {
        int result = orderFormService.deleteOrderForm(orderID);
        if (result == 1){
            return Result.getDeleteSuccessData();
        }
        return Result.getDeleteFailedData();
    }

//    @RequestMapping("/findAll.do")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result findAll() throws Exception {
        List orderList = orderFormService.findAll();
        return new Result(StateCode.SUCCESS, "获取数据成功", orderList);
    }
}
