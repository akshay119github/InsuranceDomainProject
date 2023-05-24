package com.insurance.fetchuseronetomany.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.fetchuseronetomany.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
