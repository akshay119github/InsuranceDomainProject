package com.insurance.savesettlement.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.savesettlement.model.Settlement;
import com.insurance.savesettlement.repository.SettlementRepository;
import com.insurance.savesettlement.service.SettlementService;
@Service
public class SettlementServiceIpml implements SettlementService {

	// injecting repository here
	@Autowired
	private SettlementRepository settlementRepository;

	@Override
	public Settlement saveSettlement(Settlement settlement) {
		Settlement s = settlementRepository.save(settlement);
		return s;
	}

}
