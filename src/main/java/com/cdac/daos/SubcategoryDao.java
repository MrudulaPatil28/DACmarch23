package com.cdac.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.cdac.entities.Subcategory;

@Repository
public interface SubcategoryDao extends JpaRepository<Subcategory, Integer>{
	
	Subcategory findById(int id);
	
	@Query("SELECT s FROM Subcategory s JOIN s.category c WHERE c.id = :categoryid")
	 List<Subcategory> findByCategoryid(int categoryid);
}
