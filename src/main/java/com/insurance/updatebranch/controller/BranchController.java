package com.insurance.updatebranch.controller;


import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.insurance.updatebranch.model.Branch;
import com.insurance.updatebranch.repository.BranchRepository;
import com.insurance.updatebranch.service.BranchService;

@RestController

public class BranchController {

	//injecting service here 
	
	public BranchService branchService;
	
	//injecting repository here

	public BranchRepository branchRepository;
	
	
	//design rest api to update the branch details
	@PutMapping("/updateBranch/{id}")
	public  ResponseEntity<Branch> getBranchById(@PathVariable Integer id , @RequestBody Branch branch)throws NullPointerException {
		Branch br=branchService.getBranchById(id);
		br.setBank_name(branch.getBank_name());
		br.setBank_account_number(branch.getBank_account_number());
		br.setRouting_number(branch.getRouting_number());
		br.setCheque_number(branch.getCheque_number());
		br.setAdditional_information(branch.getAdditional_information());
		
		Branch b=branchRepository.save(br);
		return ResponseEntity.ok().body(b);
	}
}
