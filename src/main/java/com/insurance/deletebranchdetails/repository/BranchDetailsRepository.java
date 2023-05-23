package com.insurance.deletebranchdetails.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.deletebranchdetails.model.BranchDetails;

@Repository
public interface BranchDetailsRepository extends CrudRepository<BranchDetails, Serializable> {

}
