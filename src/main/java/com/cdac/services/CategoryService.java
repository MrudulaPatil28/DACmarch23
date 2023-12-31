package com.cdac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.daos.ProductCategoryDao;
import com.cdac.entities.Category;

import java.util.List;

@Service
public class CategoryService implements CategoryServiceI {
    private final ProductCategoryDao categoryRepository;

    @Autowired
    public CategoryService(ProductCategoryDao categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
    
    @Override
    public Category CategoryById(int id) {
    	return categoryRepository.getById(id);
    }
    
}