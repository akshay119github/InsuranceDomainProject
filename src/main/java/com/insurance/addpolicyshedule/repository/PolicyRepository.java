package com.insurance.addpolicyshedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.addpolicyshedule.model.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer> {

}
