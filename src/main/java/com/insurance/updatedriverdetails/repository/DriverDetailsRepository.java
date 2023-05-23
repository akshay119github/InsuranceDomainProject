package com.insurance.updatedriverdetails.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.updatedriverdetails.model.DriverDetails;

@Repository
public interface DriverDetailsRepository extends CrudRepository<DriverDetails, Serializable> {

	public DriverDetails findById(Integer id);
}
