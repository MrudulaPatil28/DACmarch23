package com.cdac.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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

import com.cdac.entities.Customer;
import com.cdac.entities.Product;
import com.cdac.entities.Viewcart;
import com.cdac.models.Response;
import com.cdac.models.ViewcartDTO;
import com.cdac.services.CustomerService;
import com.cdac.services.ProductService;
import com.cdac.services.ViewCartService;



@CrossOrigin
@RestController
@RequestMapping("/api/viewcart")
public class ViewCartcontroller {

	@Autowired private ViewCartService viewcartserrvice;
	@Autowired CustomerService customerService;
	@Autowired ProductService productService;
	
	@PostMapping
	public ResponseEntity<?> saveviewcart(@RequestBody  ViewcartDTO viewcart){
		
		
		if(viewcart != null) {
			Customer customer=customerService.findById(viewcart.getCustomerid());
			Product product=productService.findProductById(viewcart.getProductid());
			
			Viewcart newviewcart = new Viewcart();
			newviewcart.setCustomer(customer);
			newviewcart.setProduct(product);
			newviewcart.setQty(viewcart.getQty());
		  boolean result = viewcartserrvice.saveviewcart(newviewcart);
		  if(result == true) {
			  return ResponseEntity.ok("pruduct added to cart successful");
		  }
		}
		 return ResponseEntity.status(HttpStatus.CONFLICT).body("please check inputs");
	}
	
	@GetMapping("/{cid}")
	public ResponseEntity<?> findviewcartbycustomer(@PathVariable("cid") int cid ){
		List<Viewcart> list= null;
		if(cid != 0) {
			list = viewcartserrvice.findbyCustomer(cid);
			
		}
		return Response.success(list);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deletecartitem(@PathVariable("id") int id) {
	
		 try {
		        boolean result = viewcartserrvice.deletecartitem(id);
		        if (result) {
		            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Item deleted");
		        } else {
		            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found. in cart");
		        }
		    } catch (DataIntegrityViolationException ex) {
		        return ResponseEntity.status(HttpStatus.CONFLICT).body("Cannot delete the cart item due to a foreign key constraint.");
		    } catch (Exception e) {
		        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while deleting the item.");
		    }
	}
}
