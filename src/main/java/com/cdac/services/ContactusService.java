package com.cdac.services;

import java.util.List;
import com.cdac.entities.Contactus;


public interface ContactusService {
	void saveContactus(Contactus cust);
	List<Contactus> allContcatus();

}
