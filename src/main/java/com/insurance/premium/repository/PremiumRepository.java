package com.insurance.premium.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.premium.model.Premium;

@Repository
public interface PremiumRepository extends CrudRepository<Premium, Integer> {

	public Premium findPremiumById(Integer id);

}
