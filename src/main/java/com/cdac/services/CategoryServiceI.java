package com.cdac.services;

import java.util.List;

import com.cdac.entities.Category;

public interface CategoryServiceI {
	List<Category> getAllCategories();
	Category createCategory(Category category);
	Category CategoryById(int id);

}
