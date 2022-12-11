package com.akansha.app.blog.payloads;

import java.util.Date;

import com.akansha.app.blog.entities.Category;
import com.akansha.app.blog.entities.User;

public class PostDto {
	
	private String title;
	
	private String content;
	
	private String imageName;
	
	private Date addedDate;
	
	private Category category;
	
	private User user;
		
	
}
