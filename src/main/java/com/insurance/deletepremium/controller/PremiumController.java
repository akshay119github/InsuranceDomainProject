package com.insurance.deletepremium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.deletepremium.service.PremiumService;

@RestController
public class PremiumController {

	@Autowired
	private PremiumService premiumService;
	
	@DeleteMapping("/premium/delete/{id}")
	public void deleteById(@PathVariable("id") Integer id) {
		premiumService.deletePremiumById(id);
	}
}
