package com.insurance.premium.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.premium.model.Premium;
import com.insurance.premium.service.PremiumService;

@RestController
public class PremiumController {

	@Autowired
	private PremiumService premiumService;

	// Design API to save premium
	@PostMapping("/savePremium")
	public Premium savePremium(@RequestBody Premium premium) {
		Premium premium1 = premiumService.savePremium(premium);
		return premium1;
	}

	// Design API to get premium
	@GetMapping("/getPremium/{id}")
	public Premium getPremiumById(@PathVariable Integer id) {
		Premium premium = premiumService.getPremiumById(id);
		return premium;
	}

	// Create Object of Logger
	private static final Logger logger = LoggerFactory.getLogger(PremiumController.class);
}
