package com.akansha.app.blog.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
	
	@NotBlank
	@Size(min = 4, , message ="Min size of category title is 4")
	private String categoryTitle;
	
	@NotBlank
	@Size(min = 10, message ="Min size of ctaegory description is 10")
	private String categoryDescription;
}
