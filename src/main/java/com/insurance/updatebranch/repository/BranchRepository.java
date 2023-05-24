package com.insurance.updatebranch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.updatebranch.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {

}
