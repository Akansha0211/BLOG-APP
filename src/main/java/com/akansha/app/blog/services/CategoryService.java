package com.akansha.app.blog.services;

import java.util.List;

import com.akansha.app.blog.payloads.CategoryDto;

public interface CategoryService {
	
	// in interfaces methods are public & abstract
	
	//create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	// delete
	void deleteCategory(Integer categoryId);
	
	// get
	CategoryDto getCategory(Integer categoryId);
	
	// getAll
	List<CategoryDto> getCategories();
}
