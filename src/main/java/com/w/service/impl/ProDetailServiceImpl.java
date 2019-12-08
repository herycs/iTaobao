package com.w.service.impl;

import com.w.dao.ProDetailDao;
import com.w.domain.ProDetail;
import com.w.service.ProDetailService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProDetailServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/17 21:04
 * @Version V1.0
 **/
@Service("proDetailService")
public class ProDetailServiceImpl implements ProDetailService {
    private ProDetailDao proDetailDao;

    @Override
    public int addProDetail(@Param("proDetail") ProDetail proDetail) throws Exception{
        int result = proDetailDao.addProDetail(proDetail);
        return result;
    }
    @Override
    public  int deleteProDetail(int proDetailID) throws Exception{
        int result1 = proDetailDao.deleteProDetail(proDetailID);
        return result1;
    }
    @Override
    public  int updateProDetail(@Param("proDetail") ProDetail proDetail) throws Exception{
        int result2 = proDetailDao.updateProDetail(proDetail);
        return result2;
    }
    @Override
    public List<ProDetail> findAllProDetail() throws Exception{
        List<ProDetail> proDetailList = proDetailDao.findAllProDetail();
        return  proDetailList;
    }


}
