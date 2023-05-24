package com.insurance.userpremium.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.insurance.userpremium.model.Premium;
import com.insurance.userpremium.repository.PremiumRepository;
import com.insurance.userpremium.service.PremiumService;


@Service
public class PremiumServiceImpl implements PremiumService {
 
	// injecting repository here,,
	@Autowired
	private PremiumRepository premiumRepository;

	

	@Override
	public Premium savePremium(Premium premium) {
		
		Premium prem = premiumRepository.save(premium);
		return prem;
	}

}
