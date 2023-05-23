package com.insurance.premiumdetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.insurance.premiumdetails.model.PremiumDetails;
import com.insurance.premiumdetails.repository.PremiumRepository;
import com.insurance.premiumdetails.service.PremiumService;

public class PremiumServiceImpl implements PremiumService {
	@Autowired
	private PremiumRepository premiumRepository;

	@Override
	public PremiumDetails getPremiumDetailsByIdF(Integer id) {
		PremiumDetails premiumDetails = premiumRepository.getById(id);
		return premiumDetails;
	}

}
