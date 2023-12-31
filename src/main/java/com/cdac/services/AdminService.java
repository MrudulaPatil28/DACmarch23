package com.cdac.services;

import com.cdac.entities.Admin;

public interface AdminService {
	Admin validate(String userid,String pwd);
	void updateAdmin(Admin admin);
}
