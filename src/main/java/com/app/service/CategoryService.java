package com.app.service;

import com.app.dto.CategoryDto;
import java.util.List;

public interface CategoryService {

	//get
	CategoryDto getSingleCategory(Integer categoryId);
	
	//get all
	List<CategoryDto> getAllCategories();
	
	//create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	CategoryDto updateCategory(CategoryDto newCategory,Integer categoryId);
	
	//delete
	void deleteCategory(Integer categoryId);
}
