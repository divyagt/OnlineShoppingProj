package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Retailer;

public interface RetailerRepository extends JpaRepository<Retailer,Integer> {

}
