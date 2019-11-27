package com.w.service;

import com.w.domain.Business;

import java.util.List;

/**
 * @ClassNameBusinessService
 * @Description
 * @Author ANGLE0
 * @Date2019/11/17 21:04
 * @Version V1.0
 **/
public interface BusinessService {

    int addBus(Business business);

    int delBus(int busID);

    int updateBus(Business business);

    List<Business> findAllBuss();

    List<Business> findBusByName(String busName);
}
