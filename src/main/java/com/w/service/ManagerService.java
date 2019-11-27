package com.w.service;

import java.util.List;

import com.w.domain.Manager;

public interface ManagerService {
	
	int addManager(Manager manager);

    int deleteManager(String managerID);

    int updateManager(Manager manager);

    List<Manager> findAllManager();

    Manager findOneByID(String managerId);

}
