package com.w.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.w.dao.ManagerDao;
import com.w.domain.Manager;
import com.w.service.ManagerService;

/**
 * @ClassName ManagerServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/17 21:04
 * @Version V1.0
 **/
@Service("managService")
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerDao managerDao;
	
	@Override
	public int addManager(Manager manager) {
		int result = managerDao.addManager(manager);
		return result;
	}

	@Override
	public int deleteManager(String managerID) {
		int result = managerDao.deleteManager(managerID);
		return result;
	}

	@Override
	public int updateManager(Manager manager) {
		int result = managerDao.updateManager(manager);
		return result;
	}

	@Override
	public List<Manager> findAllManager() {
		List managers = managerDao.findAllManager();
		return managers;
	}

	@Override
	public Manager findOneByID(String managerId) {
		return (Manager) managerDao.findManagerByID(managerId);
	}

}
