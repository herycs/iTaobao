package com.w.controller.base;

import com.w.domain.Role;
import com.w.service.RoleService;
import com.w.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassNameRoleController
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 9:08
 * @Version V1.0
 **/
@CrossOrigin
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/add.do")
    @ResponseBody
    public JsonData addRole(Role role){
        int result = roleService.addRole(role);
        if (result == 1){
            return JsonData.getAddSuccessData();
        }
        return JsonData.getAddFailedData();
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public JsonData deleteRole(int roleID){
        int result = roleService.deleRole(roleID);
        if (result == 1){
            return JsonData.getDeleteSuccessData();
        }
        return JsonData.getDeleteFailedData();
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public JsonData findAll(){
        List roleList = roleService.findAll();
        return JsonData.getJsonData(new JsonData(0,  "获取数据成功", roleList));
    }

    @RequestMapping("/update.do")
    @ResponseBody
    public JsonData updateRole(Role role){
        int result = roleService.updateRole(role);
        if(result == 1){
            return JsonData.getUpdateSuccessData();
        }
        return JsonData.getUpdateFailedData();
    }
}
