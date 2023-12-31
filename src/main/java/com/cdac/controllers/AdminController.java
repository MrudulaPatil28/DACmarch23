package com.cdac.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.daos.AdminDao;
import com.cdac.entities.Admin;
import com.cdac.models.LoginDTO;
import com.cdac.models.Response;
import com.cdac.services.AdminService;

@CrossOrigin
@RestController
@RequestMapping("/api/admin")
public class AdminController {
	
	@Autowired AdminService adminService;
	@Autowired AdminDao dao;
	
	@PostMapping("/validate")
	public ResponseEntity<?> validateUser(@RequestBody LoginDTO dto) {
		System.out.println(dto);
		Optional<Admin> admin1=dao.findById(dto.getUserid());
		if(admin1 == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Userid is not registered . Please resigter");
		}
		Admin admin=adminService.validate(dto.getUserid(),dto.getPwd());
		if(admin!=null)
			return Response.success(admin);
		else
			 return ResponseEntity.status(HttpStatus.CONFLICT).body("Please check userid and password.");
	}
	
	@PostMapping
	public ResponseEntity<?> updateProfile(@RequestBody Admin admin) {
		adminService.updateAdmin(admin);
		return Response.status(HttpStatus.OK);
	}

}
