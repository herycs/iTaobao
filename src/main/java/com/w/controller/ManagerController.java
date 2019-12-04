package com.w.controller;

import com.w.common.entity.StateCode;
import com.w.domain.Manager;
import com.w.service.ManagerService;
import com.w.common.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassNameManagerController
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 9:07
 * @Version V1.0
 **/
@CrossOrigin
@Controller
@RequestMapping("/man")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

//    @RequestMapping("/update.do")
    @RequestMapping(value = "/{managerID}", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateManager(@PathVariable("managerID") int managerID, @RequestBody Manager manager){
        manager.setMan_ID(managerID);
        int result = managerService.updateManager(manager);
        if(result == 1){
            return Result.getUpdateSuccessData();
        }
        return Result.getUpdateFailedData();
    }

//    @RequestMapping("/add.do")
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Result addManager(@RequestBody Manager manager){
        int result = managerService.addManager(manager);
        if (result == 1){
            return Result.getAddSuccessData();
        }
        return Result.getAddFailedData();
    }

//    @RequestMapping("/del.do")
    @RequestMapping(value = "/{managerID}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteManager(@PathVariable("managerID") int managerID){
        int result = managerService.deleteManager(managerID);
        if (result == 1){
            return Result.getDeleteSuccessData();
        }
        return Result.getDeleteFailedData();
    }

//    @RequestMapping("/findAll.do")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result findAll(){
        List managerList = managerService.findAllManager();
        return new Result(StateCode.SUCCESS, "获取数据成功", managerList);
    }
}
