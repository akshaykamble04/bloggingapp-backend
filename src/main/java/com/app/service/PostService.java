package com.app.service;

import java.util.List;

import com.app.dto.PostDto;
import com.app.dto.PostResponse;
import com.app.entities.Post;

public interface PostService {
	
	//get all posts
	//List<PostDto> getAllPosts(Integer pageNumber,Integer pageSize);
	PostResponse getAllPosts(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);
	
	//get single post
	PostDto getSinglePost(Integer postId);
	
	//create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	//update
	PostDto updatePost(PostDto postDto,Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//get posts by category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get posts by user
	List<PostDto> getPostsByUser(Integer userId);
	
	//search posts
	List<PostDto> searchPosts(String keyWord);
	
	

}
