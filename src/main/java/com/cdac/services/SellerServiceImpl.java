package com.cdac.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cdac.daos.SellerDao;
import com.cdac.entities.Seller;

@Service
public class SellerServiceImpl implements SellerService {

	@Autowired private SellerDao dao;
	@Override
	public boolean registerSeller(Seller seller) {
		// TODO Auto-generated method stub
		Seller seller1=dao.findByUserid(seller.getUserid());
		if(seller1 == null) {
		BCryptPasswordEncoder bcrptpwd = new BCryptPasswordEncoder();
		String encrypwd = bcrptpwd.encode(seller.getPwd());
		seller.setPwd(encrypwd);
		dao.save(seller);
		return true;
		}
		return false;
	}

	@Override
	public List<Seller> allSellers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Seller findById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public Seller validate(String userid, String pwd) {
		Seller seller=dao.findByUserid(userid);
		BCryptPasswordEncoder bcrptpwd = new BCryptPasswordEncoder();
		if(seller!=null && bcrptpwd.matches(pwd, seller.getPwd())) {
			return seller;
		}
		return null;
	}

	@Override
	public void deleteSeller(int id) {
		// TODO Auto-generated method stub
		Seller seller=dao.getById(id);
		dao.delete(seller);
	}

}
