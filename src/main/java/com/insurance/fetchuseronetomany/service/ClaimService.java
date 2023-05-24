package com.insurance.fetchuseronetomany.service;

import java.util.List;

import com.insurance.fetchuseronetomany.model.Claim;

public interface ClaimService {

	public Claim saveClaim(Claim claim);
	public List<Claim> getClaimByUserId(Integer userId);

}
