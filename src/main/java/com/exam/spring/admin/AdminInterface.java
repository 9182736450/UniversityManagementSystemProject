package com.exam.spring.admin;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminInterface extends JpaRepository <AdminRegistrationForm,String>{
//	@Query("select u From adminlogin u WHERE u.name =:n")
//	public List<AdminRegistrationForm> findByGmail(@Param("n") String name);
}

