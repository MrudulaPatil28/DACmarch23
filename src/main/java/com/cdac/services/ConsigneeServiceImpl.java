package com.cdac.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cdac.daos.ConsigneeDao;
import com.cdac.entities.Consignee;
import com.cdac.entities.Customer;


@Service
public class ConsigneeServiceImpl implements ConsigneeService {

	@Autowired private ConsigneeDao dao;

	@Override
	public boolean registerConsignee(Consignee cust) {
		// TODO Auto-generated method stub
		Consignee cc=dao.findByUserid(cust.getUserid());
		
		if(cc == null) {
		BCryptPasswordEncoder bcrptpwd = new BCryptPasswordEncoder();
		String encrypwd = bcrptpwd.encode(cust.getPwd());
		cust.setPwd(encrypwd);
		dao.save(cust);
		return true;
		}
		return false;
		
	}

	@Override
	public List<Consignee> allConsignee() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Consignee findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public Consignee validate(String userid, String pwd) {
		// TODO Auto-generated method stub
		Consignee cc=dao.findByUserid(userid);
		
		BCryptPasswordEncoder bcrptpwd = new BCryptPasswordEncoder();
		
		//if(cc!=null && cc.getPwd().equals(pwd))
			if(cc!=null &&	bcrptpwd.matches(pwd, cc.getPwd())){
			return cc;
		}
		return null;
	}

	@Override
	public boolean verifyUserId(String userid) {
		// TODO Auto-generated method stub
		return dao.findByUserid(userid)!=null;
	}

	@Override
	public void updateProfile(Consignee cust) {
		// TODO Auto-generated method stub
		if(cust.getPwd().equals("") || cust.getPwd()==null) {
			cust.setUpdatedTimestamp(new Date());
			cust.setPwd(findById(cust.getId()).getPwd());
		}
		dao.save(cust);
	}

	@Override
	public List<Consignee> findByzipcode(int zipcode) {
		
		
		return dao.findByZipCode(zipcode);
	}
	
	
}
