package com.w.service.impl;

import com.w.dao.RepertoryDao;
import com.w.domain.Repertory;
import com.w.service.RepertoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassNameRepertoryServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/20 20:44
 * @Version V1.0
 **/
@Service("repertoryService")
public class RepertoryServiceImpl implements RepertoryService {

    @Autowired
    private RepertoryDao repertoryDao;

    @Override
    public int addRepertory(Repertory repertory) throws Exception{
        int result = repertoryDao.addRepertory(repertory);
        return result;
    }

    public int deleteRepertory(int repertoryID) throws Exception{
        int result = repertoryDao.deleteRepertory(repertoryID);
        return result;
    }

    @Override
    public int updateRepertory(Repertory repertory) throws Exception{
        int result = repertoryDao.updateRepertory(repertory);
        return result;
    }

    @Override
    public List<Repertory> findAll() throws Exception{
        List<Repertory> results = repertoryDao.findAll();
        return results;
    }
}
