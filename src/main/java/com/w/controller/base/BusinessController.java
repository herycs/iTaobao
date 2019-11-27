package com.w.controller.base;

import com.w.domain.Business;
import com.w.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassNameBusinessController
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 9:05
 * @Version V1.0
 **/
@Controller
@RequestMapping("/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @RequestMapping("/findAll.do")
    @ResponseBody
    public List<Business> findAllBus(){
        List<Business> bussinessList = null;
        bussinessList = businessService.findAllBuss();
        return bussinessList;
    }

    @RequestMapping("/add.do")
    public String addBus(Business business){
        int result = 0;
        System.out.println(business.getBus_address());
        result = businessService.addBus(business);
        return "修改行数是"+result;
    }

    @RequestMapping("/del.do")
    public int delBus(int busID){
        int result1 = 0;
        result1 = businessService.delBus(busID);
        return result1;
    }

    @RequestMapping("/update.do")
    public int updateBus(Business business){
        int result2 = 0;
        result2 = businessService.updateBus(business);
        return result2;
    }
}
