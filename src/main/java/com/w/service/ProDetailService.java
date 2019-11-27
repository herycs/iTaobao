package com.w.service;

import com.w.domain.ProDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ming
 */
public interface ProDetailService {
    public int addProDetail(@Param("proDetail") ProDetail proDetail);
    public  int deleteProDetail(int proDetailID);
    public  int updateProDetail(@Param("proDetail") ProDetail proDetail);
    public List<ProDetail> findAllProDetail();
}
