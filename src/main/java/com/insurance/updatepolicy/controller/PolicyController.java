package com.insurance.updatepolicy.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.updatepolicy.model.Policy;
import com.insurance.updatepolicy.repository.PolicyRepository;
import com.insurance.updatepolicy.service.PolicyService;

@RestController
public class PolicyController {
	//injecting repository
	@Autowired
	public PolicyRepository policyRepository;
	
	//injecting service
	@Autowired
	public PolicyService policyService;

	// design the rest api to update the data
	@PutMapping("/update/{id}")
	public ResponseEntity<Policy> getPolicyById(@PathVariable Integer id, @RequestBody Policy policy) {
		Policy p = policyService.getPolicyById(id);
		
		p.setPolicy_id(policy.getPolicy_id());
		p.setPolicy_id(policy.getPolicy_id());
		p.setPolicy_effective_date(policy.getPolicy_effective_date());
		p.setPolicy_effective_date(policy.getPolicy_effective_date());
		p.setPayment_option(policy.getPayment_option());
		p.setTotal_amount(policy.getTotal_amount());
		p.setStatus(policy.getStatus());
		p.setCreated_date(policy.getCreated_date());
		p.setAdditional_info(policy.getAdditional_info());
		Policy pol = policyRepository.save(p);

		return ResponseEntity.ok().body(pol);
		

	}

}
