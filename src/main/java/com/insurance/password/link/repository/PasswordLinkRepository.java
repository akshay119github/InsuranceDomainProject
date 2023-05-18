package com.insurance.password.link.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.password.link.model.PasswordLink;

@Repository
public interface PasswordLinkRepository extends JpaRepository<PasswordLink, Integer> {

}
