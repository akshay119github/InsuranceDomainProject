package com.addPolicy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.addPolicy.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
