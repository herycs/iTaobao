package com.w.service;

import java.util.List;

import com.w.domain.Bus_detail;

public interface Bus_detailService {
	
	int addBus_detail(Bus_detail bus_detail);

    int deleteBus_detail(String bus_detailID);

    int updateBus_detail(Bus_detail bus_detail);

    List<Bus_detail> findAllBus_detail();

    Bus_detail findOneByID(String bus_detailId);

}
