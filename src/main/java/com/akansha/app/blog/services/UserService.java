package com.akansha.app.blog.services;

import java.util.List;

import com.akansha.app.blog.payloads.UserDto;

public interface UserService {
	 
	// don't pass entity into service, use payload class instead (to transfer data)
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);
}
