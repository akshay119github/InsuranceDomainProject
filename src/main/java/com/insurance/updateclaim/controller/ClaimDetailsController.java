package com.insurance.updateclaim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.updateclaim.model.ClaimDetails;
import com.insurance.updateclaim.repository.ClaimDetailsRepository;
import com.insurance.updateclaim.service.ClaimDetailsService;

@RestController
public class ClaimDetailsController {
	@Autowired
	private ClaimDetailsService claimDetailsService;
	@Autowired
	private ClaimDetailsRepository claimDetailsRepository;

	@PutMapping("/updateData/{id}")
	public ResponseEntity<ClaimDetails> getClaimDetailsById(@PathVariable Integer id,
			@RequestBody ClaimDetails claimDetails) {
		ClaimDetails claim = claimDetailsService.getClaimDetailsById(id);
		claim.setClaimId(claimDetails.getClaimId());
		claim.setPolicyId(claimDetails.getPolicyId());
		claim.setStatus(claimDetails.getStatus());
		claim.setAmount(claimDetails.getAmount());
		ClaimDetails claim1 = claimDetailsRepository.save(claim);

		return ResponseEntity.ok().body(claim1);

	}
}
