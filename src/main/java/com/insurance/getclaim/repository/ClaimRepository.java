package com.insurance.getclaim.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;

import com.insurance.getclaim.model.ClaimModel;

public interface ClaimRepository extends CrudRepository<ClaimModel, Integer> {
	public ClaimModel findClaimModelById(Integer id);

}
