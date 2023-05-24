package com.insurance.deletepremium.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.deletepremium.model.Premium;

@Repository
public interface PremiumRepository extends CrudRepository<Premium, Serializable> {

}
