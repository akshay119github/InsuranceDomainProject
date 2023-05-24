package com.insurance.getclaim.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.getclaim.model.ClaimModel;
import com.insurance.getclaim.repository.ClaimRepository;
import com.insurance.getclaim.service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService{
	
	

	@Autowired
	private ClaimRepository claimRepository;
	
	@Override
	public ClaimModel getClaimModelById(Integer id) {
		// TODO Auto-generated method stub
		ClaimModel claimModel = claimRepository.findClaimModelById(id);
		return claimModel;
	}

}
