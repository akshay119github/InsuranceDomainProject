package com.insurance.usermultiplepremium.service;

import java.util.List;

import com.insurance.usermultiplepremium.model.PolicyPremium;

public interface PolicyPremiumService {

	public PolicyPremium savePolicyPremium(PolicyPremium policyPremium);
	
	public List<PolicyPremium> getPolicyPremiumByCustomerId(Integer customer_id);

}
