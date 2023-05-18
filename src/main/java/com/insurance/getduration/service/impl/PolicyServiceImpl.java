package com.insurance.getduration.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.getduration.model.Policy;
import com.insurance.getduration.repository.PolicyRepository;
import com.insurance.getduration.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public Policy savePolicyDetails(Policy policy) {
		Policy policy1 = policyRepository.save(policy);
		return policy1;
	}

	@Override
	public List<Policy> getPolicyByDuration(Integer duration) {
		List<Policy> list = policyRepository.findByDuration(duration);
		return list;
	}

}
