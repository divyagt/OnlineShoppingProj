package com.app.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Customer;
import com.app.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {
	@Autowired  
	CustomerRepository customerRepository;
	 
	}

