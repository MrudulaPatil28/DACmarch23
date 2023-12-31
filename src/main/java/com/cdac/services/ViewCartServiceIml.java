package com.cdac.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.daos.CustomerDao;
import com.cdac.daos.ProductDao;
import com.cdac.daos.ViewCartDao;
import com.cdac.entities.Customer;
import com.cdac.entities.Product;
import com.cdac.entities.Viewcart;

@Service
public class ViewCartServiceIml implements ViewCartService {
	@Autowired private ViewCartDao dao;
	@Autowired private ProductDao pdao;
	@Autowired private CustomerDao cdao;

	@Override
	public List<Viewcart> findbyCustomer(int  cid) {
		// TODO Auto-generated method stub
		Customer custm = cdao.getById(cid);
		
		return dao.findbyCustomer(custm);
	}

	@Override
	public boolean saveviewcart( Viewcart viewcart) {
		
		
		
		if(viewcart != null ) {
			
			viewcart.setAdddate(new Date());
			dao.save(viewcart);
			
			return true;
		}
		return false;
	}

	@Override
	public boolean deletecartitem(int id) {
		// TODO Auto-generated method stub
		 Viewcart cart = dao.getById(id);
		
		 Optional<Viewcart> cartItemOptional = Optional.ofNullable(cart);
	        if (cartItemOptional.isPresent()) {
	            dao.deleteById(id);
	            return true;
	        }
	        return false;
	}
	

	
	
}
