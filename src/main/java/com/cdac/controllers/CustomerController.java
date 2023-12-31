package com.cdac.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.daos.CustomerDao;
import com.cdac.entities.Customer;
import com.cdac.models.LoginDTO;
import com.cdac.models.Response;
import com.cdac.services.CustomerService;

@CrossOrigin
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	@Autowired CustomerService customerService;
	@Autowired private CustomerDao dao;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Customer cust) {	
		
		boolean result =  customerService.registerCustomer(cust);
		
		if(result == true) {
			return ResponseEntity.ok("Registration successful");
		}
		 return ResponseEntity.status(HttpStatus.CONFLICT).body("Email is already registered.Please another one.");
	}
	
	@GetMapping
	public ResponseEntity<?> findAllCustomers() {
		List<Customer> result = customerService.allCustomers();
		return Response.success(result);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findCustomerById(@PathVariable("id") int id) {
		Customer result = customerService.findById(id);
		return Response.success(result);
	}
	
	@PostMapping("/validate")
	public ResponseEntity<?> validateUser(@RequestBody LoginDTO dto) {
		System.out.println(dto);
		Customer cus = dao.findByUserid(dto.getUserid());
		if(cus == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Userid is not registered . Please resigter");
		}
		
		Customer user=customerService.validate(dto.getUserid(),dto.getPwd());
		if(user!=null)
			return Response.success(user);
		else
			 return ResponseEntity.status(HttpStatus.CONFLICT).body("Please check userid and password.");
	}
	
	@PutMapping("{id}")
	public ResponseEntity<?> updateProfile(@RequestBody Customer cust,@PathVariable("id") int id) {
		cust.setUpdatedTimestamp(new Date());
		customerService.updateProfile(cust);
		return Response.status(HttpStatus.OK);
	}

}
