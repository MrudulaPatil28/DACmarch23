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
import org.springframework.web.bind.annotation.RestController;

import com.cdac.daos.SellerDao;
import com.cdac.entities.Seller;
import com.cdac.models.LoginDTO;
import com.cdac.models.Response;
import com.cdac.services.SellerService;

@CrossOrigin
@RestController
@RequestMapping("/api/sellers")
public class SellerController {

	@Autowired private SellerService sellerService;
	@Autowired private SellerDao dao;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Seller seller) {	
		
		boolean result = sellerService.registerSeller(seller);
		if(result == true) {
			return ResponseEntity.ok("Registration successful");
		}
		return ResponseEntity.status(HttpStatus.CONFLICT).body("Email is already registered.Please another one.");
	}
	
	@GetMapping
	public ResponseEntity<?> findAllCustomers() {
		List<Seller> result = sellerService.allSellers();
		System.out.println("All Seller");
		return Response.success(result);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> findSellerProfile(@PathVariable("id") int id) {
		Seller result = sellerService.findById(id);
		return Response.success(result);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteSeller(@PathVariable("id") int id) {
		sellerService.deleteSeller(id);
		return Response.status(HttpStatus.OK);
	}
	
	@PostMapping("/validate")
	public ResponseEntity<?> validateUser(@RequestBody LoginDTO dto) {
		
		System.out.println(dto);
		Seller seller=dao.findByUserid(dto.getUserid());
		if(seller == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Userid is not registered . Please resigter");
		}
		
		Seller user=sellerService.validate(dto.getUserid(),dto.getPwd());
		if(user!=null)
			return Response.success(user);
		else
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Please check userid and password.");
	}
	
}
