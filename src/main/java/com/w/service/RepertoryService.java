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
    int addRepertory(Repertory repertory);
    int deleteRepertory(int repertoryID);
    int updateRepertory(Repertory repertory);
    List<Repertory> findAll();
}
