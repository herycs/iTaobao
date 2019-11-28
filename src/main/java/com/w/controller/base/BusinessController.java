package com.w.controller.base;

import com.w.domain.Business;
import com.w.service.BusinessService;
import com.w.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
@Controller
@RequestMapping("/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @RequestMapping("/findAll.do")
    @ResponseBody
    public JsonData findAllBus(){
        List bussinessList = businessService.findAllBuss();
        return JsonData.getJsonData(new JsonData(0, "获取数据成功", bussinessList));
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public JsonData addBus(Business business){
        int result = 0;
        result = businessService.addBus(business);
        if (result == 1){
            return JsonData.getAddSuccessData();
        }
        return JsonData.getAddFailedData();
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public JsonData delBus(int busID){
        int result = 0;
        result = businessService.delBus(busID);
        if (result == 1){
            return JsonData.getDeleteSuccessData();
        }
        return JsonData.getDeleteFailedData();
    }

    @RequestMapping("/update.do")
    @ResponseBody
    public JsonData updateBus(Business business){
        int result = 0;
        result = businessService.updateBus(business);
        if(result == 1){
            return JsonData.getUpdateSuccessData();
        }
        return JsonData.getUpdateFailedData();
    }
}
