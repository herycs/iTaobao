package com.w.service;

import com.w.domain.ProDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ming
 */
public interface ProDetailService {
    public int addProDetail(@Param("proDetail") ProDetail proDetail) throws Exception;
    public  int deleteProDetail(int proDetailID) throws Exception;
    public  int updateProDetail(@Param("proDetail") ProDetail proDetail) throws Exception;
    public List<ProDetail> findAllProDetail() throws Exception;
}
