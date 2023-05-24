package com.insurance.addclaim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.addclaim.model.Claim;

@Repository
public interface ClaimsRepository extends JpaRepository<Claim, Integer> {

}
