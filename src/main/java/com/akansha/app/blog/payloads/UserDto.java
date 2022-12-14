package com.akansha.app.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import com.akansha.app.blog.entities.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	private int id;
	
	// for validation:
	// 1. add dependency (hibernate validator)
	// 2. Inside Bean, use validation annotations
	// 3. Inside Controller add @Valid
	// 4. Do exception handling like what msg to be displayed for each field(inside GlobalException class  custom class)
	
	// not empty checks blank and null both
	@NotEmpty
	@Size(min=4, message="Username must be min of 4 characters")
	private String name;
	
	@Email(message="Email address is not valid !!")
	private String email;
	
	@NotEmpty
	@Size(min=3, max=10, message="Password must be min of 3 chars and max of 10 chars !!")
	private String password;
	
	@NotEmpty
	private String about;
	
	private Set<RoleDto> roles = new HashSet<>();
}
