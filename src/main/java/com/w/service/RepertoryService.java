package com.w.service;

import com.w.domain.Repertory;

import java.util.List;

/**
 * @ClassNameRepertoryService
 * @Description
 * @Author ANGLE0
 * @Date2019/11/20 20:36
 * @Version V1.0
 **/
public interface RepertoryService {
    int addRepertory(Repertory repertory) throws Exception;
    int deleteRepertory(int repertoryID) throws Exception;
    int updateRepertory(Repertory repertory) throws Exception;
    List<Repertory> findAll() throws Exception;
}
