package com.insurance.deleteclaim.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.deleteclaim.model.Claim;

@Repository
public interface ClaimRepository extends CrudRepository<Claim, Integer> {

}
