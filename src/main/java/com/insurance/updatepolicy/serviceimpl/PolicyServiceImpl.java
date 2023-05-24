package com.insurance.updatepolicy.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.updatepolicy.model.Policy;
import com.insurance.updatepolicy.repository.PolicyRepository;
import com.insurance.updatepolicy.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired // injecting policy repository
	private PolicyRepository policyRepository;

	@Override
	public Policy getPolicyById(Integer id) {
		Policy policy=policyRepository.getById(id);
		return policy;
	}

	

}
