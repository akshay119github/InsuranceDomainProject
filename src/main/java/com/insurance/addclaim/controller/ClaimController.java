package com.insurance.addclaim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.addclaim.model.Claim;
import com.insurance.addclaim.service.ClaimService;

@RestController
public class ClaimController {
	@Autowired
	public ClaimService claimService;
    @PostMapping("/saveClaim")
	public Claim saveClaim(@RequestBody Claim claim) {
		Claim c = claimService.saveClaim(claim);
		return c;
	}
}
