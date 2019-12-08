package com.w.service;

import java.util.List;

import com.w.domain.Credits;
import org.springframework.stereotype.Service;

@Service("creditsService")
public interface CreditsService {
	
	int addCredits(Credits credits) throws Exception;

    int deleteCredits(Integer creditsID) throws Exception;

    int updateCredits(Credits credits) throws Exception;

    List<Credits> findAllCredits() throws Exception;

    Credits findOneByID(Integer creditsId) throws Exception;

}
