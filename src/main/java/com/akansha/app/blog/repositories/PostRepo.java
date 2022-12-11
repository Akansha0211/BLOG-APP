package com.akansha.app.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akansha.app.blog.entities.Category;
import com.akansha.app.blog.entities.Post;
import com.akansha.app.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{
	
	List<Post> getByUser(User user);
	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String title);
}
