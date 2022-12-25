package com.akansha.app.blog.security;

import com.akansha.app.blog.payloads.UserDto;

import lombok.Data;

@Data
public class JwtAuthResponse {
	private String token;
	
	private UserDto user;
	
}
