package com.w.service;

import java.util.List;

import com.w.domain.Bus_detail;

public interface Bus_detailService {
	
	int addBus_detail(Bus_detail bus_detail) throws Exception;

    int deleteBus_detail(String bus_detailID) throws Exception;

    int updateBus_detail(Bus_detail bus_detail) throws Exception;

    List<Bus_detail> findAllBus_detail() throws Exception;

    Bus_detail findOneByID(String bus_detailId) throws Exception;

}
