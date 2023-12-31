package com.cdac.controllers;

import java.util.List;

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

import com.cdac.entities.Customer;
import com.cdac.entities.Subcategory;
import com.cdac.models.Response;
import com.cdac.services.SubcategoryService;

@CrossOrigin
@RestController
@RequestMapping("/api/subcategories")
public class SubcategoryController {
	private final SubcategoryService subcategoryService;

    @Autowired
    public SubcategoryController(SubcategoryService subcategoryService) {
        this.subcategoryService = subcategoryService;
    }

    @GetMapping("/{categoryId}/subcategories")
    public ResponseEntity<List<Subcategory>> getSubcategoriesByCategoryid(@PathVariable int categoryId) {
        List<Subcategory> subcategories = subcategoryService.getSubcategoriesByCategoryNames(categoryId);
        return new ResponseEntity<>(subcategories, HttpStatus.OK);
    }

    @PostMapping("/{categoryId}/addsubcategories")
    public ResponseEntity<Subcategory> createSubcategory( @PathVariable int categoryId,
    	      @RequestBody Subcategory subcategory) {
    	System.out.println(subcategory);
        Subcategory createdSubcategory = subcategoryService.createSubcategory(categoryId,subcategory);
        return new ResponseEntity<>(createdSubcategory, HttpStatus.CREATED);
    }
    
    @GetMapping("/allSubcategories")
    public ResponseEntity<?> getAllsubcategories(){
    	List<Subcategory> result = subcategoryService.allSubcategories();
		return Response.success(result);
    }
   
}