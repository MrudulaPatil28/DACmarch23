package com.cdac.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.entities.Contactus;



public interface ContactusDao extends JpaRepository<Contactus, Integer> {
	

} 


