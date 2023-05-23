package com.insurance.addpolicyshedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.addpolicyshedule.model.Policy;
import com.insurance.addpolicyshedule.repository.PolicyRepository;
import com.insurance.addpolicyshedule.service.PolicyService;

@RestController
public class PolicyController {

	@Autowired
	private PolicyService policyService;
	
	@Autowired
	private PolicyRepository policyRepository;
	
	@PostMapping("/policy/add")
	public ResponseEntity<Policy> getPolicyById(@RequestBody Policy policy){
		Policy policy1 = policyService.savePolicy(policy);
		
		return ResponseEntity.ok().body(policy1);
		
	}
}
