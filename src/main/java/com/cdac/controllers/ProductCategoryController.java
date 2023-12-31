package com.cdac.controllers;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.daos.ProductCategoryDao;
import com.cdac.daos.SubcategoryDao;
import com.cdac.entities.Category;
import com.cdac.models.Response;
import com.cdac.services.CategoryService;
import com.fasterxml.jackson.annotation.JsonIgnore;


@CrossOrigin
@RestController
@RequestMapping("/api/categories")
public class ProductCategoryController {
	
	private final CategoryService categoryService;

    @Autowired
    public ProductCategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categories = categoryService.getAllCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        Category createdCategory = categoryService.createCategory(category);
        return new ResponseEntity<>(createdCategory, HttpStatus.CREATED);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> findbyid(@PathVariable int id) {
    	Category cat = categoryService.CategoryById(id);
    	
    	return Response.success(cat);
    	
    }
	
}

