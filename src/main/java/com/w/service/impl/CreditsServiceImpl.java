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
	public int addCredits(Credits credits) {
		int result = credictsDao.addCredits(credits);
		return result;
	}

	@Override
	public int deleteCredits(Integer creditsID) {
		int result = credictsDao.deleteCredits(creditsID);
		return result;
	}

	@Override
	public int updateCredits(Credits credits) {
		int result = credictsDao.updateCredits(credits);
		return result;
	}

	@Override
	public List<Credits> findAllCredits() {
		return credictsDao.findAllCredits();
	}

	@Override
	public Credits findOneByID(Integer creditsId) {
		return (Credits) credictsDao.findCreditsByID(creditsId);
	}

}
