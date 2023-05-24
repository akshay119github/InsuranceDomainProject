package com.insurance.deletepremium.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.deletepremium.repository.PremiumRepository;
import com.insurance.deletepremium.service.PremiumService;

@Service
public class PremiumServiceImpl implements PremiumService {

	@Autowired
	private PremiumRepository premiumRepository;
	
	@Override
	public void deletePremiumById(Integer id) {
		// TODO Auto-generated method stub
		premiumRepository.deleteById(id);
		
		
	}

}
