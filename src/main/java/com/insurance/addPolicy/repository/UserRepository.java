package com.insurance.addPolicy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.addPolicy.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
