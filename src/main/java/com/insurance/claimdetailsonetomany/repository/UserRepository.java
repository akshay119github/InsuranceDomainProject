package com.insurance.claimdetailsonetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.claimdetailsonetomany.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
