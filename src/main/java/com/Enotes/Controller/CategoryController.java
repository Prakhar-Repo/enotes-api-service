package com.Enotes.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Enotes.Entity.Category;
import com.Enotes.Service.CategoryService;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {
	
	@Autowired
	private CategoryService catService;
	
	@PostMapping("/addNew")
	public ResponseEntity<?> saveCategory(@RequestBody Category category)
	{
		
		Boolean status = catService.saveCategory(category);
		if(status)
		{
		return new ResponseEntity<>("saved", HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity<>("not saved", HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	@GetMapping("/findcat")
	public ResponseEntity<?> getallCategory()
	{
		
		List<Category> catList = catService.getAllCategory();
		if(catList.size()>=1)
		{
		return new ResponseEntity<>(catList,HttpStatus.OK);
		}
		else
		{
			return  ResponseEntity.noContent().build();

		}
	}

}
