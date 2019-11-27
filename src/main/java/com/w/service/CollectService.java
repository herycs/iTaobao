package com.w.service;

import java.util.List;

import com.w.domain.Collect;

public interface CollectService {
	
	int addCollect(Collect collect);

    int deleteCollect(int collectID);

    int updateCollect(Collect collect);

    List<Collect> findAllCollect();

    Collect findOneByID(int collectId);

}
