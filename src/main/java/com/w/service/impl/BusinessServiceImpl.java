package com.w.service.impl;

import com.w.dao.BusinessDao;
import com.w.domain.Business;
import com.w.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName BusinessServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/17 21:04
 * @Version V1.0
 **/
@Service("businessService")
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessDao businessDao;

    @Override
    public int addBus(Business business) throws Exception{
        int result = 0;
        result = businessDao.addBusiness(business);
        if (result != 1){
            return -1;
        }
        return result;
    }

    @Override
    public int delBus(int busID) throws Exception{
        int result1 = 0;
        result1 = businessDao.deleteBusiness(busID);
        if (result1 != 1){
            return -1;
        }
        return result1;
    }

    @Override
    public int updateBus(Business business) throws Exception{
        int result2 = 0;
        result2 = businessDao.updateProduct(business);
        if (result2 != 1) {
            return -1;
        }
        return result2;
    }

    @Override
    public List<Business> findAllBuss() throws Exception{
        List<Business> busList = null;
        busList = businessDao.findAllBusiness();
        return busList;
    }

    @Override
    public List<Business> findBusByName(String busName) throws Exception{
        List<Business> list = null;
        list = businessDao.findBusinessByName(busName);
        return list;
    }
}
