package com.cdac.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.daos.ProductCategoryDao;
import com.cdac.entities.Category;
import com.cdac.entities.Product;
import com.cdac.entities.Seller;
import com.cdac.entities.Subcategory;
import com.cdac.models.ProductDTO;
import com.cdac.models.ProductPagedResponseDTO;
import com.cdac.models.ProductResponseDTO;
import com.cdac.models.Response;
import com.cdac.services.CategoryService;
import com.cdac.services.ProductService;
import com.cdac.services.SellerService;
import com.cdac.services.SubcategoryService;

@CrossOrigin
@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired ProductService productService;
	@Autowired SellerService sellerService;
	@Autowired  CategoryService categoryService;
	@Autowired  SubcategoryService subcategoryService;
	
	 @Autowired
	  private  ProductCategoryDao categoryRepository;
	
	@PostMapping
	public ResponseEntity<?> saveProduct(ProductDTO dto) {
		
		System.out.println(dto.getPcat().getId());
		Product product=ProductDTO.toEntity(dto);
		Seller seller=sellerService.findById(dto.getSellerId());
		product.setSeller(seller);
		Optional<Category> category = categoryRepository.findById(dto.getPcat().getId());
		Category category1 = categoryRepository.getById(dto.getPcat().getId());
		product.setPcat(category1);
		productService.addProduct(product,dto.getPic());
		return Response.success(product);
	}
	
	@PutMapping
	public ResponseEntity<?> updateProduct(@RequestBody ProductResponseDTO product) {
		System.out.println(product);
		
		if(product != null) {
			Subcategory sub = subcategoryService.findbyid(product.getSubcatid());
			 Category cat=categoryService.CategoryById(product.getPcatid());
			 Seller seller = sellerService.findById(product.getSellerId());
			 Product updateproduct = productService.findProductById(product.getProdid());
			 updateproduct.setPname(product.getPname());
			 updateproduct.setBrand(product.getBrand());
			 updateproduct.setCreatedTimestamp(new Date());
			 updateproduct.setPcat(cat);
			 updateproduct.setSubcat(sub);
			
			 updateproduct.setPrice(product.getPrice());
			
			 boolean result =  productService.updateProduct(updateproduct);
			 if(result == true) {
				  return ResponseEntity.ok("pruduct updated successfully");
			  }
			}
			 return ResponseEntity.status(HttpStatus.CONFLICT).body("please check inputs");
	}
	
	/*
	@PutMapping
	public ResponseEntity<?> updateProduct(@RequestBody Product product) {
		System.out.println(product);		
		productService.updateProduct(product);
		return Response.success(product);		
	}
	*/
	@GetMapping("{id}")
	public ResponseEntity<?> findProduct(@PathVariable("id")int id) {
		Product product=productService.findProductById(id);
		return Response.success(ProductResponseDTO.fromEntity(product));
	}
	
	@GetMapping
	public ResponseEntity<?> findAllProducts(Optional<Integer> sellerid) {
		List<ProductResponseDTO> result = new ArrayList<ProductResponseDTO>();
		if(sellerid.isPresent()) {
			System.out.println(sellerid);
			for(Product p : productService.findProducts(sellerid.get())) {
				result.add(ProductResponseDTO.fromEntity(p));	
			}	
		}else {
			for(Product p : productService.allProducts()) {
				result.add(ProductResponseDTO.fromEntity(p));	
			}
		}
		return Response.success(result);
	}
	
	@GetMapping("/paginated")
	public ResponseEntity<?> paginatedProducts(int page,int pagesize,Optional<Integer> cat,Optional<Integer> subcat,Optional<Integer> sellerid) {
		
		List<ProductResponseDTO> result = new ArrayList<ProductResponseDTO>();
		Page<Product> data;
		if(cat.isPresent() && subcat.isPresent()&& sellerid.isPresent()) {
			data=productService.allProductsPaginated(page, pagesize,cat.get(),subcat.get(),sellerid.get());
		}else
		if(cat.isPresent() && subcat.isPresent()) {
			System.out.println(cat);
			System.out.println(subcat);
			data=productService.allProductsPaginated(page, pagesize,cat.get(),subcat.get(),0);
			
		}else if(cat.isPresent()){
			data=productService.allProductsPaginated(page, pagesize,cat.get(),0,0);
		}else {
			System.out.println("hi");
			data=productService.allProductsPaginated(page, pagesize,0,0,0);
		}
		data.forEach(item-> {
			result.add(ProductResponseDTO.fromEntity(item));
		});
		System.out.println("From pagination");
		ProductPagedResponseDTO resp=new ProductPagedResponseDTO();
		resp.setPagesize(pagesize);
		resp.setCurrent(page);
		resp.setTotal(data.getTotalElements());
		resp.setPlist(result);
		return Response.success(resp);
	}
	
	@GetMapping("cats")
	public ResponseEntity<?> findCategoryProducts(Optional<Integer> cat,Optional<Integer> subcat) {
		List<ProductResponseDTO> result = new ArrayList<ProductResponseDTO>();
		System.out.println(cat);
		
		if(cat.isPresent() && subcat.isPresent()) {
			System.out.println(cat);
			for(Product p : productService.categorySubProducts(cat.get(), subcat.get())) {
				result.add(ProductResponseDTO.fromEntity(p));
			}
		}
		return Response.success(result);
	}
	
	
	
	/*
	@GetMapping("/paginated")
	public ResponseEntity<?> paginatedProducts(int page,int pagesize) {
		
		List<ProductResponseDTO> result = new ArrayList<ProductResponseDTO>();
		Page<Product> data=productService.allProductsPaginated(page, pagesize);
		data.forEach(item-> {
			result.add(ProductResponseDTO.fromEntity(item));
		});
		System.out.println("From pagination");
		ProductPagedResponseDTO resp=new ProductPagedResponseDTO();
		resp.setPagesize(pagesize);
		resp.setCurrent(page);
		resp.setTotal(data.getTotalElements());
		resp.setPlist(result);
		return Response.success(resp);
	}
		*/
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable("id") int id) {
		/*
		boolean result = productService.deleteProduct(id);
		System.out.println(result);
		if(result == true) {
		return Response.status(HttpStatus.OK);
		}
		 return ResponseEntity.status(HttpStatus.CONFLICT).body("order is palced against product");
		 */
		 try {
			 boolean result = productService.deleteProduct(id);
		        if (result) {
		            return ResponseEntity.ok().build();
		        } else {
		            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found.");
		        }
		    } catch (DataIntegrityViolationException ex) {
		        return ResponseEntity.status(HttpStatus.CONFLICT).body("Cannot delete the product due to a foreign key constraint.");
		    }
	}
}
