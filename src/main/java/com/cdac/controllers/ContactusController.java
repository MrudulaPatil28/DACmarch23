package com.cdac.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.entities.Contactus;
import com.cdac.entities.Customer;
import com.cdac.models.Response;
import com.cdac.services.ContactusService;

@CrossOrigin
@RestController
@RequestMapping("/api/contactus")

public class ContactusController {
	@Autowired	ContactusService contactusService;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Contactus cust) {		
		contactusService.saveContactus(cust);
		return Response.success(cust);
	}
	
	@GetMapping("/contactlist")
	public ResponseEntity<?> findAllContactus() {
		List<Contactus> result = contactusService.allContcatus();
		return Response.success(result);
	}

}
