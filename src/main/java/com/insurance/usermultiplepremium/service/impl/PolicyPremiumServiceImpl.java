package com.insurance.usermultiplepremium.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.usermultiplepremium.model.PolicyPremium;
import com.insurance.usermultiplepremium.repository.PolicyPremiumRepository;
import com.insurance.usermultiplepremium.service.PolicyPremiumService;

@Service
public class PolicyPremiumServiceImpl implements PolicyPremiumService {

	// Inject Repository
	@Autowired
	private PolicyPremiumRepository policyPremiumRepository;
	
	@Override
	public PolicyPremium savePolicyPremium(PolicyPremium policyPremium) {
		PolicyPremium policyPremium1 = policyPremiumRepository.save(policyPremium);
		return policyPremium1;
	}

	@Override
	public List<PolicyPremium> getPolicyPremiumByCustomerId(Integer customer_id) {
		List<PolicyPremium> list = policyPremiumRepository.findPolicyPremiumByCustomerId(customer_id);
		return list;
	}

}
