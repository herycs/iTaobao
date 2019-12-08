package com.w.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.w.dao.CollectDao;
import com.w.domain.Collect;
import com.w.service.CollectService;

/**
 * @ClassName CollectServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/17 21:04
 * @Version V1.0
 **/
@Service("collectService")
public class CollectServiceImpl implements CollectService {

	@Autowired
	private CollectDao collectDao;
	
	@Override
	public int addCollect(Collect collect) throws Exception{
		int result = collectDao.addCollect(collect);
		return result;
	}

	@Override
	public int deleteCollect(int collectID) throws Exception{
		int result = collectDao.deleteCollect(collectID);
		return result;
	}

	@Override
	public int updateCollect(Collect collect) throws Exception{
		int result = collectDao.updateCollect(collect);
		return result;
	}

	@Override
	public List<Collect> findAllCollect() throws Exception{
		
		return collectDao.findAllCollect();
	}

	@Override
	public Collect findOneByID(int collectId) throws Exception{
		
		return (Collect) collectDao.findCollectByID(collectId);
	}

}
