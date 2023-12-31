package com.cdac.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cdac.daos.ProductCategoryDao;
import com.cdac.daos.ProductDao;
import com.cdac.daos.SubcategoryDao;
import com.cdac.entities.Category;
import com.cdac.entities.Product;
import com.cdac.entities.Seller;
import com.cdac.entities.Subcategory;
import com.cdac.utils.StorageService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired ProductDao dao;
	@Autowired
	private StorageService storageService;
	
	@Autowired SellerService sellerService;
	
	@Autowired private ProductCategoryDao catrgorydao;
	
	@Autowired CategoryService categoryService;
	
	@Autowired private  SubcategoryDao  subcategory;
	
	
	@Override
	public void addProduct(Product p,MultipartFile pic) {
		// TODO Auto-generated method stub
		String photo=storageService.store(pic);
		p.setPhoto(photo);
		dao.save(p);
	}

	@Override
	public List<Product> findProducts(int sellerId) {
		System.out.println("in service"+sellerId);
		// TODO Auto-generated method stub
		return dao.findBySeller(sellerService.findById(sellerId),Sort.by(Sort.Direction.DESC,"prodid"));
	}

	@Override
	public boolean updateProduct(Product p) {
		if(p != null) {
			dao.save(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteProduct(int prodid) {
		// TODO Auto-generated method stub
		Product p=dao.getById(prodid);
		dao.delete(p);
		Product s=dao.getById(prodid);
		if(s == null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Product> allProducts() {
		// TODO Auto-generated method stub
		List<Product> result = dao.findAll(Sort.by(Sort.Direction.DESC,"prodid"));
		for(Product oneresult :result) {
			System.out.println(oneresult.getPcat().getId());
		}
		return result;
	}

	@Override
	public Product findProductById(int prodid) {
		// TODO Auto-generated method stub
		return dao.getById(prodid);
	}

	@Override
	public List<Product> categorySubProducts(int pcat,int subcat) {
		System.out.println(pcat);
		Category cat = catrgorydao.getById(pcat);
		System.out.println(cat.getName());
		List<Product> result = dao.findByPcatAndSubcat(categoryService.CategoryById(pcat), subcategory.getById(subcat),Sort.by(Sort.Direction.DESC,"prodid"));
		// TODO Auto-generated method stub
		for(Product oneresult :result) {
			System.out.println(oneresult.getPcat().getId());
		}
		return result;
		
	}

	@Override
	public Page<Product> allProductsPaginated(int page,int pagesize,int cat,int subcat,int sellerId) {
		
		Page<Product> prods;
		if(cat==0 && subcat == 0 && sellerId ==0 ) {
			prods=dao.findAll(PageRequest.of(page, pagesize,Sort.by(Direction.DESC, "prodid")));
		
		}else if(cat==0 && subcat == 0 && sellerId != 0){
		
			List<Product> content = dao.findBySeller(sellerService.findById(sellerId),Sort.by(Sort.Direction.DESC,"prodid"));
			prods = new PageImpl<Product>(content,PageRequest.of(page, pagesize),content.size());
		}
		else if(subcat == 0 && sellerId ==0 && cat != 0) {
			List<Product> content = dao.findByPcat(catrgorydao.getById(cat),Sort.by(Sort.Direction.DESC,"prodid"));
			prods = new PageImpl<Product>(content,PageRequest.of(page, pagesize),content.size());
			//Page<Product>  result = new PageImpl<Product>(content);
			//prods = result;
			
		}
		else if(sellerId ==0 && cat!=0 && subcat != 0 ){
			List<Product> content1 = dao.findByPcatAndSubcat(categoryService.CategoryById(cat), subcategory.getById(subcat),Sort.by(Sort.Direction.DESC,"prodid"));
			prods = new PageImpl<>(content1,PageRequest.of(page, pagesize),content1.size());
		}else if(subcat == 0 && sellerId !=0 && cat!=0) {
			List<Product> content2 = dao.findByPcatAndSeller(categoryService.CategoryById(cat),sellerService.findById(sellerId), Sort.by(Sort.Direction.DESC,"prodid"));
			prods = new PageImpl<>(content2,PageRequest.of(page, pagesize),content2.size());
		} else {
		List<Product> css = dao.findByPcatAndSubcatAndSeller(categoryService.CategoryById(cat), subcategory.getById(subcat),sellerService.findById(sellerId),Sort.by(Sort.Direction.DESC,"prodid"));
		prods = new PageImpl<>(css,PageRequest.of(page, pagesize),css.size());}
		for(Product oneresult :prods) {
			System.out.println(oneresult.getPcat().getId());
		}
		System.err.println(prods.getSize());
		return prods; 
		/*
		System.out.println("in productservice");
		List<Product> prods;
	    if (cat == 0 && subcat == 0) {
	    	System.out.println("in productservice");
	        prods = dao.findAll(Sort.by(Direction.DESC, "prodid"));
	        for (Product oneresult : prods) {
		         System.out.println(oneresult.getProdid());
		    }
	    } else if (subcat == 0) {
	        prods = dao.findByPcat(catrgorydao.getById(cat), Sort.by(Sort.Direction.DESC, "prodid"));
	    } else {
	        prods = dao.findByPcatAndSubcat(categoryService.CategoryById(cat), subcategory.getById(subcat), Sort.by(Sort.Direction.DESC, "prodid"));
	    }
	    
	    int start = (page - 1) * pagesize;
	    int end = Math.min(start + pagesize, prods.size());
	    List<Product> pageContent = prods.subList(start, end);
	    
	    PageRequest pageRequest = PageRequest.of(page, pagesize);
	    Page<Product> resultPage = new PageImpl<>(pageContent, pageRequest, prods.size());
	   
	    for (Product oneresult : resultPage) {
	    	System.out.println("final result");
	         System.out.println(oneresult.getProdid());
	    }
	    System.err.println(resultPage.getSize());
	    return resultPage;
	*/
	}

	@Override
	public List<Product> categoryProducts(int pcat) {
		// TODO Auto-generated method stub
		return dao.findByPcat(catrgorydao.getById(pcat),Sort.by(Sort.Direction.DESC,"prodid"));
	
	}
}
