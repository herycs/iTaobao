package com.w.controller.base;

import com.w.domain.Manager;
import com.w.service.ManagerService;
import com.w.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/update.do")
    @ResponseBody
    public JsonData updateManager(Manager manager){
        int result = managerService.updateManager(manager);
        if(result == 1){
            return JsonData.getUpdateSuccessData();
        }
        return JsonData.getUpdateFailedData();
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public JsonData addManager(Manager manager){
        int result = managerService.addManager(manager);
        if (result == 1){
            return JsonData.getAddSuccessData();
        }
        return JsonData.getAddFailedData();
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public JsonData deleteManager(String managerID){
        int result = managerService.deleteManager(managerID);
        if (result == 1){
            return JsonData.getDeleteSuccessData();
        }
        return JsonData.getDeleteFailedData();
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public JsonData findAll(){
        List managerList = managerService.findAllManager();
        return JsonData.getJsonData(new JsonData(0, "获取数据成功", managerList));
    }
}
