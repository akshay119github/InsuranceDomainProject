package com.insurance.fetchuseronetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.fetchuseronetomany.model.Claim;
import com.insurance.fetchuseronetomany.model.User;
import com.insurance.fetchuseronetomany.service.ClaimService;
import com.insurance.fetchuseronetomany.service.UserService;

@RestController
public class UserController {

	// injecting user service here
	@Autowired
	public UserService userService;
	// injecting claim service here
	@Autowired
	public ClaimService claimService;

	@PostMapping("/saveUserClaim")
	public User saveUserPolicy(@RequestBody User user) {

		User use = userService.saveUser(user);

		List<Claim> list = user.getClaimList();
		for (Claim claim : list) {
			claim.setUserId(user.getId());
			claimService.saveClaim(claim);
		}
		return use;

	}

	

	// Design API to fetch data using userId
	@GetMapping("/getClaim/{id}")
	public List<Claim> getClaimByUserId(@PathVariable Integer userId) {
		List<Claim> list = claimService.getClaimByUserId(userId);
		return list;
	}

}
