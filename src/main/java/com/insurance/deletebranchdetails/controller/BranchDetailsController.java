package com.insurance.deletebranchdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.deletebranchdetails.service.BranchDetailsService;

@RestController
public class BranchDetailsController {
	@Autowired
	private BranchDetailsService branchDetailsService;

	@DeleteMapping
	public void deleteBranchDetailsById(@PathVariable("id") Integer id) {
		branchDetailsService.deleteById(id);
	}
}
