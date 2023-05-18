package com.insurance.deleteclaim.service;

import com.insurance.deleteclaim.model.Claim;

public interface ClaimService {

	public Claim saveClaimDetails(Claim claim);

	public Claim deleteClaimById(Integer id);

}
