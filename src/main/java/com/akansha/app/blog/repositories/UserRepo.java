package com.akansha.app.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akansha.app.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	// JPA repositories provides all functionalities for all db operations on User
	
}
