package com.w.service;

import java.util.List;

import com.w.domain.Manager;

public interface ManagerService {
	
	int addManager(Manager manager);

    int deleteManager(int managerID);

    int updateManager(Manager manager);

    List<Manager> findAllManager();

    Manager findOneByID(int managerId);

}
