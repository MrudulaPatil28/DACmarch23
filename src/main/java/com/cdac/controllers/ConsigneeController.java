package com.cdac.controllers;

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

import com.cdac.daos.ConsigneeDao;
import com.cdac.entities.Consignee;

import com.cdac.models.LoginDTO;
import com.cdac.models.Response;
import com.cdac.services.ConsigneeService;


@CrossOrigin
@RestController
@RequestMapping("/api/consignee")
public class ConsigneeController {

	@Autowired ConsigneeService consigneeService;
	@Autowired private ConsigneeDao dao;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Consignee cust) {		
		boolean result = consigneeService.registerConsignee(cust);
		System.out.println(cust);
		if(result == true) {
			return ResponseEntity.ok("Registration successful");
		}
		 return ResponseEntity.status(HttpStatus.CONFLICT).body("Email is already registered");
	}
	
	@GetMapping
	public ResponseEntity<?> findAllCustomers() {
		List<Consignee> result = consigneeService.allConsignee();
		return Response.success(result);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findConsigneeById(@PathVariable("id") int cid) {
		Consignee result = consigneeService.findById(cid);
		return Response.success(result);
		 
	}
	
	@PostMapping("/validate")
	public ResponseEntity<?> validateUser(@RequestBody LoginDTO dto) {
		System.out.println(dto);
		Consignee cc=dao.findByUserid(dto.getUserid());
		if(cc == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Userid is not registered . Please resigter");
		}
		Consignee user=consigneeService.validate(dto.getUserid(),dto.getPwd());
		if(user!=null)
			return Response.success(user);
		else
			 return ResponseEntity.status(HttpStatus.CONFLICT).body("Please check userid and password.");
	}
	
	@PutMapping("{id}")
	public ResponseEntity<?> updateProfile(@RequestBody Consignee cust,@PathVariable("id") int id) {
		consigneeService.updateProfile(cust);
		return Response.status(HttpStatus.OK);
	}
	
	@GetMapping("/zipcode/{zipcode}")
	public ResponseEntity<?> findConsigneeByZipcode(@PathVariable("zipcode") int zipcode) {
		List<Consignee> result = consigneeService.findByzipcode(zipcode);
		return Response.success(result);
	}
	

}
