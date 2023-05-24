package com.insurance.savepremium.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.savepremium.model.Premium;

@Repository
public interface PremiumRepository extends JpaRepository<Premium, Integer>{

}
