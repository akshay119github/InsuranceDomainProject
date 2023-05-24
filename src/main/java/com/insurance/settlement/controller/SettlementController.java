package com.insurance.settlement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.settlement.model.Settlement;
import com.insurance.settlement.repository.SettlementRepository;
import com.insurance.settlement.service.SettlementService;

@RestController
public class SettlementController {
	
	@Autowired
	private SettlementService settlementService;
	
	@Autowired
	private SettlementRepository settlementRepository;
	
	// Design Rest API to save settlement details
	@PostMapping("/saveSettlement")
	public Settlement saveSettlement(@RequestBody Settlement settlement) {
		return settlementService.saveSettlement(settlement);
	}
	
	// Design Rest API to update settlement details
	@PutMapping("/updateSettlement/{id}")
	public Settlement getSettlementById(@PathVariable Integer id, @RequestBody Settlement settlement) {
		Settlement sett = settlementService.getSettlementById(id);
		sett.setSettlement_id(settlement.getSettlement_id());
		sett.setDate(settlement.getDate());
		sett.setAmount(settlement.getAmount());
		sett.setClaim_id(settlement.getClaim_id());
		sett.setStatus(settlement.getStatus());
		
		return settlementRepository.save(sett);
	}
	
	// Create Object of Logger
		private static final Logger logger = LoggerFactory.getLogger(SettlementController.class);

}
