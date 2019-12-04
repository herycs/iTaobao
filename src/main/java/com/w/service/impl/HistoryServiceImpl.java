package com.w.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.w.dao.HistoryDao;
import com.w.domain.History;
import com.w.service.HistoryService;

/**
 * @ClassName HistoryServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/17 21:04
 * @Version V1.0
 **/
@Service("historyService")
public class HistoryServiceImpl implements HistoryService {

	@Autowired
	private HistoryDao historyDao;
	
	@Override
	public int addHistory(History history) {
		int result = historyDao.addHistory(history);
		return result;
	}

	@Override
	public int deleteHistory(int historyID) {
		int result = historyDao.deleteHistory(historyID);
		return result;
	}

	@Override
	public int updateHistory(History history) {
		int result = historyDao.updateHistory(history);
		return result;
	}

	@Override
	public List<History> findAllHistory() {
		return historyDao.findAllHistory();
	}

	@Override
	public History findOneByID(int historyId) {
		// TODO Auto-generated method stub
		return (History) historyDao.findHistoryByID(historyId);
	}

}
