package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Login>{
	
	 public Login findUserByAname(String aname);
	}


