package com.xyz.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.project.model.Product;
import com.xyz.project.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		final List<Product> products=new ArrayList<>();
		productRepository.findAll().forEach(product -> products.add(product));
		return products;
	}
}
