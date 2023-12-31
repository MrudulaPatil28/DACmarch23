package com.cdac.daos;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.entities.Category;
import com.cdac.entities.Product;
import com.cdac.entities.Seller;
import com.cdac.entities.Subcategory;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	
	List<Product> findBySeller(Seller sellerId,Sort sort);
	List<Product> findByPcatAndSubcat(Category pcatid,Subcategory subcatid,Sort sort);
	List<Product> findByPcatAndSubcatAndSeller(Category pcatid,Subcategory subcatid,Seller sellerId, Sort sort);
	List<Product> findByPcatAndSeller(Category pcatid,Seller sellerId, Sort sort);
	List<Product> findByPcat(Category pcatid,Sort sort);
	//List<Product> findByPcatAndSubcat(Long pcat,Long subcat,Sort sort);
}
