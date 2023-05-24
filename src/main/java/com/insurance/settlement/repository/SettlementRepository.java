package com.insurance.settlement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.settlement.model.Settlement;

@Repository
public interface SettlementRepository extends CrudRepository<Settlement, Integer> {
	
	public Settlement findSettlementById(Integer id);

}
