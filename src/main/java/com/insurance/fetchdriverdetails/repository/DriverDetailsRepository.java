package com.insurance.fetchdriverdetails.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.fetchdriverdetails.model.DriverDetails;

@Repository
public interface DriverDetailsRepository extends CrudRepository<DriverDetails, Serializable> {

	public DriverDetails findById(Integer id);
}
