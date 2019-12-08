package com.w.controller;

import com.w.common.entity.StateCode;
import com.w.domain.Permission;
import com.w.service.PermissionService;
import com.w.common.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

//    @RequestMapping("/update.do")
    @RequestMapping(value = "/{perID}", method = RequestMethod.PUT)
    @ResponseBody
    public Result updatePermission(@PathVariable("perID") int perID, @RequestBody Permission permission) throws Exception {
        permission.setPermissionID(perID);
        int result = permissionService.updatePermission(permission);
        if(result == 1){
            return Result.getUpdateSuccessData();
        }
        return Result.getUpdateFailedData();
    }

//    @RequestMapping("/add.do")
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Result addPermission(@RequestBody Permission permission) throws Exception {
        int result = permissionService.addPermission(permission);
        if (result == 1){
            return Result.getAddSuccessData();
        }
        return Result.getAddFailedData();
    }

//    @RequestMapping("/del.do")
    @RequestMapping(value = "/{perID}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deletePermission(@PathVariable("perID") int perID) throws Exception {
        int result = permissionService.deletePermission(perID);
        if (result == 1){
            return Result.getDeleteSuccessData();
        }
        return Result.getDeleteFailedData();
    }

//    @RequestMapping("/findAll.do")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result findAll() throws Exception {
        List permissionList = permissionService.findAll();
        return new Result(StateCode.SUCCESS, "获取数据成功", permissionList);
    }
}
