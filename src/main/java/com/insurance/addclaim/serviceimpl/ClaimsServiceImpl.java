package com.insurance.addclaim.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.addclaim.model.Claim;
import com.insurance.addclaim.repository.ClaimsRepository;
import com.insurance.addclaim.service.ClaimService;

@Service
public class ClaimsServiceImpl implements ClaimService {

	@Autowired
	public ClaimsRepository claimRepository;

	@Override
	public Claim saveClaim(Claim claim) {
		Claim cl = claimRepository.save(claim);
		return cl;
		
	}

}
