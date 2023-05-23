package com.insurance.updatepremiumdetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.insurance.updatepremiumdetails.model.PremiumDetails;
import com.insurance.updatepremiumdetails.repository.PremiumRepository;
import com.insurance.updatepremiumdetails.service.PremiumService;

public class PremiumServiceImpl implements PremiumService {
	@Autowired
	private PremiumRepository premiumRepository;

	@Override
	public PremiumDetails getPremiumDetailsByIdF(Integer id) {
		PremiumDetails premiumDetails = premiumRepository.getById(id);
		return premiumDetails;
	}

}
