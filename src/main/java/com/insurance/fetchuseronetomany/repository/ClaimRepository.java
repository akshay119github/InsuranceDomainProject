package com.insurance.fetchuseronetomany.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.insurance.fetchuseronetomany.model.Claim;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Integer> {
	@Query(value = "select * from claim where id=?1", nativeQuery = true)

	List<Claim> findByUserId(Integer userId);

}
