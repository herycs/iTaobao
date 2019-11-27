package com.w.controller.base;

import com.w.domain.Manager;
import com.w.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@Controller
@RequestMapping("/man")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @RequestMapping("/update.do")
    public String updateManager(Manager manager){
        int result = managerService.updateManager(manager);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/add.do")
    public String addManager(Manager manager){
        int result = managerService.addManager(manager);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/del.do")
    public String deleteManager(String managerID){
        int result = managerService.deleteManager(managerID);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public List<Manager> findAll(){
        List managerList = managerService.findAllManager();
        return managerList;
    }
}
