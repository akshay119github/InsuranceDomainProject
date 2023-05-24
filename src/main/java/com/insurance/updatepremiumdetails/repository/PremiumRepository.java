package com.insurance.updatepremiumdetails.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.updatepremiumdetails.model.PremiumDetails;

@Repository
public interface PremiumRepository extends CrudRepository<PremiumDetails, Integer> {
	public PremiumDetails getById(Integer id);

}
