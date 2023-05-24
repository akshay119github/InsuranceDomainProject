package com.insurance.getclaim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.getclaim.model.ClaimModel;
import com.insurance.getclaim.service.ClaimService;

@RestController
public class ClaimController {
	
	@Autowired
	private ClaimService claimService;

	@GetMapping("/claim/{id}")
	public ClaimModel getClaimById(@PathVariable Integer id) {
		
		ClaimModel claimModel = claimService.getClaimModelById(id);
		
		return claimModel;
		
		
		
	}

}
