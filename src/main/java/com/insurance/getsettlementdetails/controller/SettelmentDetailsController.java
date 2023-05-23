package com.insurance.getsettlementdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.getsettlementdetails.model.SettelmentDetails;
import com.insurance.getsettlementdetails.service.SettelmentDetailsService;

@RestController
public class SettelmentDetailsController {
	@Autowired
	private SettelmentDetailsService settelmentDetailsService;

	public ResponseEntity<SettelmentDetails> getSettelmentDetailsById(@PathVariable("id") Integer id) {
		SettelmentDetails settle = settelmentDetailsService.getSettelmentDetailsById(id);
		return ResponseEntity.ok().body(settle);

	}

}
