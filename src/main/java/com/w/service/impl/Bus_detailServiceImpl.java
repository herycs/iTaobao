package com.w.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.w.dao.Bus_detailDao;
import com.w.domain.Bus_detail;
import com.w.service.Bus_detailService;

/**
 * @ClassName Bus_detailServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 8:13
 * @Version V1.0
 **/
@Service("busDetailService")
public class Bus_detailServiceImpl implements Bus_detailService {

	@Autowired
	private Bus_detailDao  bus_detailDao;
	
	@Override
	public int addBus_detail(Bus_detail bus_detail) {
		int result = bus_detailDao.addBus_detail(bus_detail);
		return result;
	}

	@Override
	public int deleteBus_detail(String bus_detailID) {
		int result = bus_detailDao.deleteBus_detail(bus_detailID);
		return result;
	}

	@Override
	public int updateBus_detail(Bus_detail bus_detail) {
		int result = bus_detailDao.updateBus_detail(bus_detail);
		return result;
	}

	@Override
	public List<Bus_detail> findAllBus_detail() {
		List<Bus_detail> bus_details =  bus_detailDao.findAllBus_detail();
		return bus_details;
	}

	@Override
	public Bus_detail findOneByID(String bus_detailId) {
		
		return (Bus_detail) bus_detailDao.findBus_detailByID(bus_detailId);
	}

	

}
