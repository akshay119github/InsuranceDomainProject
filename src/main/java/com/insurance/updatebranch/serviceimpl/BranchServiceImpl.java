package com.insurance.updatebranch.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.insurance.updatebranch.model.Branch;
import com.insurance.updatebranch.repository.BranchRepository;


public class BranchServiceImpl implements com.insurance.updatebranch.service.BranchService {

	@Autowired
	private BranchRepository branchRepository;

	@Override
	public Branch getBranchById(Integer id) {
		Branch b = branchRepository.getById(id);
		return b;
	}

}
