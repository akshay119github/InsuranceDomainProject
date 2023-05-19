package com.insurance.premium.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.premium.model.Premium;

@Repository
public interface PremiumRepository extends CrudRepository<Premium, Integer> {

	public Premium findPremiumById(Integer id);

}
