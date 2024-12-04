package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.dao.Users;


public interface UserRepo extends JpaRepository<Users, Integer>{
	
	Users findByUsername(String username);

}
