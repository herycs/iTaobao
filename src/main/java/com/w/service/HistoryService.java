package com.w.service;

import java.util.List;

import com.w.domain.History;

public interface HistoryService {
	
	int addHistory(History history);

    int deleteHistory(String historyID);

    int updateHistory(History history);

    List<History> findAllHistory();

    History findOneByID(String historyId);

}
