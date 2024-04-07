package com.exam.spring.admin;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="adminlogin")
public class AdminRegistrationForm {
	
	@Id
	private String gmail;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String adminphoto;

public AdminRegistrationForm() {
}

public AdminRegistrationForm(String gmail,String password,String adminphoto) {
this.gmail=gmail;
this.password=password;
this.adminphoto=adminphoto;

}

public String getGmail() {
	return gmail;
}

public void setGmail(String gmail) {
	this.gmail = gmail;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getAdminphoto() {
	return adminphoto;
}

public void setAdminphoto(String adminphoto) {
	this.adminphoto = adminphoto;
}

@Override
public String toString() {
	return "adminlogin [gmail=" + gmail + ", password=" + password + ", adminphoto=" + adminphoto + "]";
}

}