package com.insurance.deletebranchdetails.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.deletebranchdetails.repository.BranchDetailsRepository;
import com.insurance.deletebranchdetails.service.BranchDetailsService;

@Service
public class BranchDetailsServiceImpl implements BranchDetailsService {
	@Autowired
	private BranchDetailsRepository branchDetailsRepository;

	@Override
	public void deleteById(Integer id) {
		branchDetailsRepository.deleteById(id);
	}

}
