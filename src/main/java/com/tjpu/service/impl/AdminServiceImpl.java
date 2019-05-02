package com.tjpu.service.impl;


import com.tjpu.dao.AdminMapper;
import com.tjpu.pojo.Admin;
import com.tjpu.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value="adminService")
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminMapper am;


	public Admin findAdmin(Long phone, String password) {
		// TODO Auto-generated method stub
		return am.findAdmin(phone,password);
	}


	public Admin findAdminById(Integer id) {
		// TODO Auto-generated method stub
		return am.findAdminById(id);
	}


	public void updateAdmin(Admin admins) {
		 am.updateAdmin(admins);
	}


	

}
