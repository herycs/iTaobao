package com.w.controller.base;

import com.w.domain.Permission;
import com.w.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassNamePremissionController
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 9:07
 * @Version V1.0
 **/
@Controller
@RequestMapping("/permission")
public class PermissionController {
    
    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/update.do")
    public String updatePermission(Permission permission){
        int result = permissionService.updatePermission(permission);
        if (result == 1) {
            return "sucess";
        }
        return "filed";
    }

    @RequestMapping("/add.do")
    public String addPermission(Permission permission){
        int result = permissionService.addPermission(permission);
        if (result == 1) {
            return "sucess";
        }
        return "filed";
    }

    @RequestMapping("/del.do")
    public String deletePermission(String permissionID){
        int result = permissionService.deletePermission(permissionID);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public List<Permission> findAll(){
        List permissionList = permissionService.findAll();
        return permissionList;
    }
}
