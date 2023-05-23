package com.insurance.deletesettlement.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.deletesettlement.model.SettelmentDetails;

@Repository
public interface SettelmentDetailsRepository extends CrudRepository<SettelmentDetails, Serializable> {

}
