package com.estore.product.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estore.product.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	
	public List<Product> findAll();
	
	public Product findById(int id);
	
	public Product save(Product order);
}
