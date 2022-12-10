package com.akansha.app.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akansha.app.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{
	
}
