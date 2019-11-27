package com.w.controller.base;

import com.w.domain.Role;
import com.w.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/add.do")
    public String addRole(Role role){
        int result = roleService.addRole(role);
        if (result == 1) {
            return "sucess";
        }
        return "filed";
    }

    @RequestMapping("/del.do")
    public String deleteRole(int roleID){
        int result = roleService.deleRole(roleID);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public List<Role> findAll(){
        List roleList = roleService.findAll();
        return roleList;
    }

    @RequestMapping("/update.do")
    public String updateRole(Role role){
        int result = roleService.updateRole(role);
        return "result";
    }
}
