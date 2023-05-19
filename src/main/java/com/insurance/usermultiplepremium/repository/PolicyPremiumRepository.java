package com.insurance.usermultiplepremium.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.usermultiplepremium.model.PolicyPremium;

@Repository
public interface PolicyPremiumRepository extends CrudRepository<PolicyPremium, Integer> {
	
	@Query(value = "select * from policypremium where customer_id=?1", nativeQuery = true)
	public List<PolicyPremium> findPolicyPremiumByCustomerId(Integer customer_id);


}
