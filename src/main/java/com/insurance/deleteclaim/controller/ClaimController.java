package com.insurance.deleteclaim.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.deleteclaim.model.Claim;
import com.insurance.deleteclaim.service.ClaimService;

@RestController
public class ClaimController {

	// Inject Service
	@Autowired
	private ClaimService claimService;

	// Design Rest API to insert claim details
	@PostMapping("/saveClaim")
	public Claim saveClaim(@RequestBody Claim claim) {
		Claim claim1 = claimService.saveClaimDetails(claim);
		return claim1;
	}

	// Design Rest API to delete claim details
	@DeleteMapping("/deleteClaim/{id}")
	public Claim deleteClaimById(@PathVariable Integer id) {
		Claim claim = claimService.deleteClaimById(id);
		return claim;
	}
	
	// Create Object of Logger
	private static final Logger logger = LoggerFactory.getLogger(ClaimController.class);

}
