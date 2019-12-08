package com.w.service;

import java.util.List;

import com.w.domain.Manager;

public interface ManagerService {
	
	int addManager(Manager manager) throws Exception;

    int deleteManager(int managerID) throws Exception;

    int updateManager(Manager manager) throws Exception;

    List<Manager> findAllManager() throws Exception;

    Manager findOneByID(int managerId) throws Exception;

}
