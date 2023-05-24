package com.insurance.savesettlement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.savesettlement.model.Settlement;
import com.insurance.savesettlement.service.SettlementService;

@RestController
public class SettlementController {

	// injecting service here
	@Autowired
	public SettlementService settlementService;

	@PostMapping("/saveSettlement")
	public ResponseEntity<Settlement> saveSettlement(@RequestBody Settlement settlement) {
		Settlement s = settlementService.saveSettlement(settlement);
		return ResponseEntity.ok().body(s);
	}
}
