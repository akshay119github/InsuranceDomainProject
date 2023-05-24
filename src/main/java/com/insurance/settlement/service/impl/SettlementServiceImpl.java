package com.insurance.settlement.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.settlement.model.Settlement;
import com.insurance.settlement.repository.SettlementRepository;
import com.insurance.settlement.service.SettlementService;

@Service
public class SettlementServiceImpl implements SettlementService {

	@Autowired
	private SettlementRepository settlementRepository;

	@Override
	public Settlement saveSettlement(Settlement settlement) {
		return settlementRepository.save(settlement);
	}

	@Override
	public Settlement getSettlementById(Integer id) {
		return settlementRepository.findSettlementById(id);
	}
	
	// Create Object of Logger
		private static final Logger logger = LoggerFactory.getLogger(SettlementServiceImpl.class);

}
