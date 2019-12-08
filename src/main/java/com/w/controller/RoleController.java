package com.w.controller;

import com.w.common.entity.StateCode;
import com.w.domain.Role;
import com.w.service.RoleService;
import com.w.common.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

//    @RequestMapping("/add.do")
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Result addRole(@RequestBody Role role) throws Exception {
        int result = roleService.addRole(role);
        if (result == 1){
            return Result.getAddSuccessData();
        }
        return Result.getAddFailedData();
    }

//    @RequestMapping("/del.do")
    @RequestMapping(value = "/{roleID}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteRole(@PathVariable("roleID") int roleID) throws Exception {
        int result = roleService.deleRole(roleID);
        if (result == 1){
            return Result.getDeleteSuccessData();
        }
        return Result.getDeleteFailedData();
    }

//    @RequestMapping("/findAll.do")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result findAll() throws Exception {
        List roleList = roleService.findAll();
        return new Result(StateCode.SUCCESS ,  "获取数据成功", roleList);
    }

//    @RequestMapping("/update.do")
    @RequestMapping(value = "/{roleID}", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateRole(@PathVariable("roleID") int roleID, @RequestBody Role role) throws Exception {
        role.setRoleID(roleID);
        int result = roleService.updateRole(role);
        if(result == 1){
            return Result.getUpdateSuccessData();
        }
        return Result.getUpdateFailedData();
    }
}
