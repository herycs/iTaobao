package com.w.service;

import java.util.List;

import com.w.domain.History;

public interface HistoryService {
	
	int addHistory(History history) throws Exception;

    int deleteHistory(int historyID) throws Exception;

    int updateHistory(History history) throws Exception;

    List<History> findAllHistory() throws Exception;

    History findOneByID(int historyId) throws Exception;

}
