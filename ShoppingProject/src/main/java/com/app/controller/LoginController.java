package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Login;
import com.app.model.Retailer;
import com.app.repository.LoginRepository;
import com.app.repository.RetailerRepository;
import com.app.service.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/login/api")
public class LoginController {
	@Autowired
	LoginService loginservice;
    @GetMapping("/validate/{aname}/{apass}")
	public int validateAdmin(@PathVariable(value="aname") String aname,@PathVariable(value="apass") String apass) {
    Login a;
    	a=loginservice.findlogin(aname) ;
		if(a==null) {
//			username does not exist
			return 1;
		}
		else if(a.getPassword().equals(apass)) {
//			correct password
			return 2;
		}
//		wrong credentials
		else
		return 3;
	}
}
    

