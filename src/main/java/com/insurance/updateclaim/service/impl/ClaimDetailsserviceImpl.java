package com.insurance.updateclaim.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.updateclaim.model.ClaimDetails;
import com.insurance.updateclaim.repository.ClaimDetailsRepository;
import com.insurance.updateclaim.service.ClaimDetailsService;
@Service
public class ClaimDetailsserviceImpl implements ClaimDetailsService {
@Autowired
	private ClaimDetailsRepository claimDetailsRepository;
	
	
	@Override
	public ClaimDetails getClaimDetailsById(Integer id) {
		claimDetailsRepository.getById(id);
		return null;
	}

}
