package com.w.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.w.dao.CreditsDao;
import com.w.domain.Credits;
import com.w.service.CreditsService;

/**
 * @ClassName CreditsServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/17 21:04
 * @Version V1.0
 **/
@Service("creditService")
public class CreditsServiceImpl implements CreditsService {

	@Autowired
	private CreditsDao credictsDao;
	
	@Override
	public int addCredits(Credits credits) throws Exception{
		int result = credictsDao.addCredits(credits);
		return result;
	}

	@Override
	public int deleteCredits(Integer creditsID) throws Exception{
		int result = credictsDao.deleteCredits(creditsID);
		return result;
	}

	@Override
	public int updateCredits(Credits credits) throws Exception{
		int result = credictsDao.updateCredits(credits);
		return result;
	}

	@Override
	public List<Credits> findAllCredits() throws Exception{
		return credictsDao.findAllCredits();
	}

	@Override
	public Credits findOneByID(Integer creditsId) throws Exception{
		return (Credits) credictsDao.findCreditsByID(creditsId);
	}

}
