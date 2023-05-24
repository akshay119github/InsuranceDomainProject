package com.insurance.fetchuseronetomany.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.fetchuseronetomany.model.Claim;
import com.insurance.fetchuseronetomany.repository.ClaimRepository;
import com.insurance.fetchuseronetomany.service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService {
	@Autowired
	public ClaimRepository claimRepository;

	@Override
	public Claim saveClaim(Claim claim) {
		Claim clm = claimRepository.save(claim);
		return clm;
	}

	@Override
	public List<Claim> getClaimByUserId(Integer userId) {
		// List<Claim> list= claimRepository.findByUserId(userId);
		List<Claim> list = claimRepository.findByUserId(userId);
		return list;
	}

}
