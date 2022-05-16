package com.app.service;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repository.CustomerRepository;
import com.app.repository.RetailerRepository;

@Service
@Transactional
public class RetailerService {
	
	
	@Autowired  
	RetailerRepository retailerRepository;

	


	
}
