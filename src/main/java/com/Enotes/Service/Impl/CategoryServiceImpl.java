package com.Enotes.Service.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.Enotes.Entity.Category;
import com.Enotes.Repository.CategoryRepository;
import com.Enotes.Service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository catRepo;
	
	@Override
	public Boolean saveCategory(Category category) {
		// TODO Auto-generated method stub
	category.setIsDeleted(false);
	category.setUpdatedBy(1);
	category.setCreatedOn(new Date());
	Category cat =	catRepo.save(category);
	if(ObjectUtils.isEmpty(cat))
	{
		return false;
	}
		
		return true;
	}

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		
		List<Category> allCat = catRepo.findAll();
		return allCat;
	}

}
