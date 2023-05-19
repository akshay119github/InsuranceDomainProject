package com.insurance.usermultiplepremium.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.usermultiplepremium.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
