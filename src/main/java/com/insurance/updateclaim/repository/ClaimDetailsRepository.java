package com.insurance.updateclaim.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.updateclaim.model.ClaimDetails;

@Repository
public interface ClaimDetailsRepository extends CrudRepository<ClaimDetails, Integer> {
	public ClaimDetails getById(Integer id);
}
