package com.insurance.premiumdetails.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.premiumdetails.model.PremiumDetails;

@Repository
public interface PremiumRepository extends CrudRepository<PremiumDetails, Integer> {
	public PremiumDetails getById(Integer id);

}
