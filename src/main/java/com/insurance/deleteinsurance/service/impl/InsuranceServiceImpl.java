package com.insurance.deleteinsurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.insurance.deleteinsurance.repository.InsuranceRepository;
import com.insurance.deleteinsurance.service.InsuranceService;

public class InsuranceServiceImpl implements InsuranceService {
	@Autowired
	private InsuranceRepository insuranceRepository;

	@Override
	public void deleteById(Integer id) {

	}

}
