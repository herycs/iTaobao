package com.w.service;

import java.util.List;

import com.w.domain.Collect;

public interface CollectService {
	
	int addCollect(Collect collect) throws Exception;

    int deleteCollect(int collectID) throws Exception;

    int updateCollect(Collect collect) throws Exception;

    List<Collect> findAllCollect() throws Exception;

    Collect findOneByID(int collectId) throws Exception;

}
