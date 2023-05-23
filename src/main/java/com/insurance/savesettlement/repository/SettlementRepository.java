package com.insurance.savesettlement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.savesettlement.model.Settlement;

@Repository
public interface SettlementRepository extends JpaRepository<Settlement, Integer> {

}
