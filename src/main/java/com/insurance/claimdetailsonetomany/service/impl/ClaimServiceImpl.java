package com.insurance.claimdetailsonetomany.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.claimdetailsonetomany.model.Claim;
import com.insurance.claimdetailsonetomany.repository.ClaimRepository;
import com.insurance.claimdetailsonetomany.service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService {
	@Autowired
	private ClaimRepository claimRepository;

	@Override
	public Claim saveClaim(Claim claim) {
		Claim insurance = claimRepository.save(claim);
		return insurance;
	}

}
