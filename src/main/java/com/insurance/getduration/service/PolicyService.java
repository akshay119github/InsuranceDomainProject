package com.insurance.getduration.service;

import java.util.List;

import com.insurance.getduration.model.Policy;

public interface PolicyService {

	public Policy savePolicyDetails(Policy policy);

	public List<Policy> getPolicyByDuration(Integer duration);

}
