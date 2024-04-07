package com.exam.spring.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminService {
	@Autowired
	private AdminInterface sr;
	
	public void addadmin( AdminRegistrationForm s) {
		sr.save(s);
	}
	public void updatestudent(AdminRegistrationForm s) {
		sr.save(s);
	}
	public void deletestudent(AdminRegistrationForm s) {
		sr.delete(s);
	}
	
	public List<AdminRegistrationForm> showallstudent(){
		return sr.findAll();
	}
	
	

}
