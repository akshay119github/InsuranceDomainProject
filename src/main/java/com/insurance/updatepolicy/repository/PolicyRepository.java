package com.insurance.updatepolicy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.updatepolicy.model.Policy;
@Repository
public interface PolicyRepository extends CrudRepository<Policy, Integer> {

	public Policy getById(Integer id);
}
