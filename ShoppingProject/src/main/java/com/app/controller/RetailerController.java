package com.app.controller;
import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Customer;
import com.app.model.Retailer;
import com.app.repository.CustomerRepository;
import com.app.repository.RetailerRepository;
import com.app.service.RetailerService;




@RestController

public class RetailerController {
	@Autowired
    private RetailerRepository retailerRepository;

    @GetMapping("/retailer")
    public List<Retailer> getAllretailers() {
        return retailerRepository.findAll();
    }
   
    @PostMapping("/retailer")
    public Retailer createRetailer(@Valid @RequestBody Retailer retailer) {
        return retailerRepository.save(retailer);
    }
    
  
}
