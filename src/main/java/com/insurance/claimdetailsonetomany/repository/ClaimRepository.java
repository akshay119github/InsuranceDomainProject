package com.insurance.claimdetailsonetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.claimdetailsonetomany.model.Claim;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Integer> {

}
