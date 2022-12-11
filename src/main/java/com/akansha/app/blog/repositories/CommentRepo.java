package com.akansha.app.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akansha.app.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{
	
}
