package com.insurance.userpremium.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.insurance.userpremium.model.User;


@Repository
public interface UsersRepository extends JpaRepository<User, Integer>{

}
