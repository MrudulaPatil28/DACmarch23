package com.cdac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cdac.daos.ProductCategoryDao;
import com.cdac.daos.SubcategoryDao;
import com.cdac.entities.Category;
import com.cdac.entities.Customer;
import com.cdac.entities.Subcategory;

import java.util.List;
import java.util.Optional;

@Service
public class SubcategoryService {
    private final SubcategoryDao subcategoryRepository;
    
    @Autowired
	  private  ProductCategoryDao categoryRepository;

    @Autowired
    public SubcategoryService(SubcategoryDao subcategoryRepository) {
        this.subcategoryRepository = subcategoryRepository;
    }

    public List<Subcategory> getSubcategoriesByCategoryNames(int categoryid) {
        return subcategoryRepository.findByCategoryid(categoryid);
    }

    
    public Subcategory createSubcategory(
  	       int categoryId,
  	       Subcategory subcategory) {
  	    Optional<Category> category = categoryRepository.findById(categoryId);
  	    if (category.isPresent()) {
  	      subcategory.setCategory(category.get());
  	      return subcategoryRepository.save(subcategory);
  	    } else {
  	    	return null;
  	      //throw new IllegalArgumentException("Invalid category ID: " + categoryId);
  	    }
  	  }
   
    public List<Subcategory> allSubcategories() {
    	return subcategoryRepository.findAll();
    }
    
    public Subcategory findbyid(int id) {
    	return subcategoryRepository.findById(id);
    }

}