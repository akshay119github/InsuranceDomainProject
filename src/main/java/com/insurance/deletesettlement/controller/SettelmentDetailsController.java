package com.insurance.deletesettlement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.deletesettlement.model.SettelmentDetails;
import com.insurance.deletesettlement.service.SettelmentDetailsService;

@RestController
public class SettelmentDetailsController {
	@Autowired
	private SettelmentDetailsService settelmentDetailsService;

	@DeleteMapping
	public void deleteSettelmentDetailsById(@PathVariable("id") Integer id) {
		settelmentDetailsService.deleteById(id);
	}

}
