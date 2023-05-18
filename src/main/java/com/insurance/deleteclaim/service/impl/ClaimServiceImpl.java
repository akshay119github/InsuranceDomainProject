package com.insurance.deleteclaim.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.deleteclaim.model.Claim;
import com.insurance.deleteclaim.repository.ClaimRepository;
import com.insurance.deleteclaim.service.ClaimService;


@Service
public class ClaimServiceImpl implements ClaimService {

	// Inject Repository
	@Autowired
	private ClaimRepository claimRepository;

	@Override
	public Claim saveClaimDetails(Claim claim) {
		Claim claim1 = claimRepository.save(claim);
		return claim1;
	}

	@Override
	public Claim deleteClaimById(Integer id) {
		claimRepository.deleteById(id);
		return null;
	}

}
