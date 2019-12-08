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

    int addBus(Business business) throws Exception;

    int delBus(int busID) throws Exception;

    int updateBus(Business business) throws Exception;

    List<Business> findAllBuss() throws Exception;

    List<Business> findBusByName(String busName) throws Exception;
}
