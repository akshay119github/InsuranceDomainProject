package com.insurance.settlement.service;

import com.insurance.settlement.model.Settlement;

public interface SettlementService {
	
	public Settlement saveSettlement(Settlement settlement);
	
	public Settlement getSettlementById(Integer id);


}
