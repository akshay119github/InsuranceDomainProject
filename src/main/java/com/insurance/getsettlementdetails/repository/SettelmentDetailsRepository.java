package com.insurance.getsettlementdetails.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.getsettlementdetails.model.SettelmentDetails;

@Repository
public interface SettelmentDetailsRepository extends CrudRepository<SettelmentDetails, Serializable> {
	public SettelmentDetails findById(Integer id);
}
