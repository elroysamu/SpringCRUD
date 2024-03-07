package com.samu.SpringCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samu.SpringCRUD.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByName(String name);
	
}
