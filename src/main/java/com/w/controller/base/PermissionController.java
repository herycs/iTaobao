package com.w.controller.base;

import com.w.domain.Permission;
import com.w.service.PermissionService;
import com.w.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
@Controller
@RequestMapping("/permission")
public class PermissionController {
    
    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/update.do")
    @ResponseBody
    public JsonData updatePermission(Permission permission){
        int result = permissionService.updatePermission(permission);
        if(result == 1){
            return JsonData.getUpdateSuccessData();
        }
        return JsonData.getUpdateFailedData();
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public JsonData addPermission(Permission permission){
        int result = permissionService.addPermission(permission);
        if (result == 1){
            return JsonData.getAddSuccessData();
        }
        return JsonData.getAddFailedData();
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public JsonData deletePermission(String permissionID){
        int result = permissionService.deletePermission(permissionID);
        if (result == 1){
            return JsonData.getDeleteSuccessData();
        }
        return JsonData.getDeleteFailedData();
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public JsonData findAll(){
        List permissionList = permissionService.findAll();
        return JsonData.getJsonData(new JsonData(0, "获取数据成功", permissionList));
    }
}
