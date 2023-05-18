package com.insurance.getduration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.getduration.model.Policy;
import com.insurance.getduration.service.PolicyService;

@RestController
public class PolicyController {

	@Autowired
	private PolicyService policyService;

	// Design API to save policy
	@PostMapping("/savePolicy")
	public Policy savePolicyDetails(@RequestBody Policy policy) {
		Policy policy2 = policyService.savePolicyDetails(policy);
		return policy2;
	}

	// Design API to get Policy by duration
	@GetMapping("/getPolicy/{duration}")
	public List<Policy> getPolicyByDuration(@PathVariable Integer duration) {
		List<Policy> list = policyService.getPolicyByDuration(duration);
		return list;

	}
}
