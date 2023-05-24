package com.insurance.addbankdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.addbankdetails.model.BankDetails;
import com.insurance.addbankdetails.service.BankDetailsService;

@RestController
public class BankDetailsController {

	// Injecting the service
	@Autowired
	private BankDetailsService userService;

	// Design API to store branch details
	@PostMapping("/saveUser")
	public ResponseEntity<BankDetails> saveBankDetails(@RequestBody BankDetails bankDetails) {
		BankDetails u = userService.saveDetails(bankDetails);
		return ResponseEntity.ok().body(u);
	}
}
