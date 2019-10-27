package com.w.service.impl;

import com.w.dao.RoleDao;
import com.w.domain.Role;
import com.w.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassNameRoleServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/10/27 16:13
 * @Version V1.0
 **/
public class RoleServiceImpl implements RoleService {

    @Override
    public List<Role> findRoleByUserID(String userID) {
        return null;
    }
}