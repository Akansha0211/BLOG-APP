package com.akansha.app.blog.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	
	// to be done..
	//  Validation in categoryDto using Hibernate Validator
	//  Enable those validations using CategoryController
	
	private Integer categoryId;
	private String categoryTitle;
	private String categoryDescription;
}
