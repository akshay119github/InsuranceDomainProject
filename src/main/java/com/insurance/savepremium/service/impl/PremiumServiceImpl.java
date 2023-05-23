package com.insurance.savepremium.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.savepremium.model.Premium;
import com.insurance.savepremium.repository.PremiumRepository;
import com.insurance.savepremium.service.PremiumService;

@Service
public class PremiumServiceImpl implements PremiumService {

	@Autowired
	private PremiumRepository premiumRepository;

	@Override
	public Premium savePremium(Premium premium) {
		// TODO Auto-generated method stub
		Premium premium1 = premiumRepository.save(premium);
		return premium1;
	}

}
