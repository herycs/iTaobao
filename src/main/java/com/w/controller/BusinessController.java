package com.w.controller;

import com.w.common.entity.StateCode;
import com.w.domain.Business;
import com.w.service.BusinessService;
import com.w.common.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

//    @RequestMapping("/findAll.do")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result findAllBus() throws Exception {
        List bussinessList = businessService.findAllBuss();
        return new Result(StateCode.SUCCESS, "获取数据成功", bussinessList);
    }

//    @RequestMapping("/add.do")
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Result addBus(@RequestBody Business business) throws Exception {
        int result = 0;
        result = businessService.addBus(business);
        if (result == 1){
            return Result.getAddSuccessData();
        }
        return Result.getAddFailedData();
    }

//    @RequestMapping("/del.do")
    @RequestMapping(value = "/{busID}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result delBus(@PathVariable("busID") int busID) throws Exception {
        int result = 0;
        result = businessService.delBus(busID);
        if (result == 1){
            return Result.getDeleteSuccessData();
        }
        return Result.getDeleteFailedData();
    }

//    @RequestMapping("/update.do")
    @RequestMapping(value = "/{busID}", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateBus(@PathVariable("busID") int busID, @RequestBody Business business) throws Exception {
        business.setBus_ID(busID);
        int result = 0;
        result = businessService.updateBus(business);
        if(result == 1){
            return Result.getUpdateSuccessData();
        }
        return Result.getUpdateFailedData();
    }
}
