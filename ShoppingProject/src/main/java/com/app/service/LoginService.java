package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Login;
import com.app.repository.LoginRepository;

@Service
@Transactional
public class LoginService {
	     
		@Autowired
		LoginRepository loginrepo;
	     
	
		public Login findlogin(String aname) {
			
		return loginrepo.findUserByAname(aname);
		}
	}

