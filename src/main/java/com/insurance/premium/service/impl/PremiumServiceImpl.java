package com.insurance.premium.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.premium.model.Premium;
import com.insurance.premium.repository.PremiumRepository;
import com.insurance.premium.service.PremiumService;

@Service
public class PremiumServiceImpl implements PremiumService {

	@Autowired
	private PremiumRepository premiumRepository;

	@Override
	public Premium savePremium(Premium premium) {
		Premium premium1 = premiumRepository.save(premium);
		return premium1;
	}

	@Override
	public Premium getPremiumById(Integer id) {
		Premium premium = premiumRepository.findPremiumById(id);
		return premium;
	}
	
	// Create Object of Logger
	private static final Logger logger = LoggerFactory.getLogger(PremiumServiceImpl.class);

}
