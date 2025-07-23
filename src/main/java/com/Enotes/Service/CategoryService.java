package com.Enotes.Service;

import java.util.List;

import com.Enotes.Entity.Category;

public interface CategoryService {

	public Boolean saveCategory(Category category);	
	
	public List<Category> getAllCategory();
}
