package com.insurance.savepremium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.savepremium.model.Premium;
import com.insurance.savepremium.service.PremiumService;

@RestController
public class PremiumController {
	
	@Autowired
	private PremiumService premiumService;
	
	@PostMapping("/save/premium")
	public ResponseEntity<Premium> savePremium(@RequestBody Premium premium){
		Premium premium1 = premiumService.savePremium(premium);
		return ResponseEntity.ok().body(premium1);
		
	}

}
