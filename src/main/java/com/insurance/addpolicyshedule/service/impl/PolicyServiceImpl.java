package com.insurance.addpolicyshedule.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.addpolicyshedule.model.Policy;
import com.insurance.addpolicyshedule.repository.PolicyRepository;
import com.insurance.addpolicyshedule.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public Policy savePolicy(Policy policy) {
		// TODO Auto-generated method stub
		Policy policy1 =policyRepository.save(policy);
		
		return policy1;
	}
	

}
