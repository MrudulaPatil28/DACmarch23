package com.cdac.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.multipart.MultipartFile;

import com.cdac.entities.Category;
import com.cdac.entities.Product;
import com.cdac.entities.Seller;
import com.cdac.entities.Subcategory;

public interface ProductService {
	void addProduct(Product p,MultipartFile pic);
	List<Product> findProducts(int sellerId);
	boolean updateProduct(Product p);
	boolean deleteProduct(int prodid);
	List<Product> allProducts();
	List<Product> categorySubProducts(int pcat,int subcat);
	List<Product> categoryProducts(int pcat);
	
	Product findProductById(int prodid);
	Page<Product> allProductsPaginated(int page,int pagesize,int cat,int subcat,int sellerid);
}
