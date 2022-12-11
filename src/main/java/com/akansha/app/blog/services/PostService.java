package com.akansha.app.blog.services;

import java.util.List;

import com.akansha.app.blog.entities.Post;
import com.akansha.app.blog.payloads.PostDto;

public interface PostService {

	//create
	Post createPost(PostDto postDto);
	
	//update 
	Post updatePost(PostDto postDto, Integer postId);
	
	//delete
	
	void deletePost(Integer postId);
	
	// get all posts
	List<Post> getAllPost();
	
	// get single post
	Post getPostById(Integer postId);
	
	// get all post by category
	List<Post> getPostsByCategory(Integer categoryId);
	
	// get all posts by user
	List<Post> getPostsByUser(Integer userId);
	
	// search posts
	List<Post> searchPosts(String keyword);
}
