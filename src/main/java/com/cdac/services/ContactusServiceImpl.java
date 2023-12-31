package com.cdac.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.daos.ContactusDao;

import com.cdac.entities.Contactus;

@Service
public class ContactusServiceImpl implements ContactusService	{
	
	@Autowired private ContactusDao dao;

	

	@Override
	public List<Contactus> allContcatus() {
		
		return dao.findAll();
	}

	@Override
	public void saveContactus(Contactus cust) {

		dao.save(cust);
		
	}

}
