package com.xyz.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.xyz.project.model.Product;
import com.xyz.project.repository.ProductRepository;

@Service
public class DbSeeder implements CommandLineRunner {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		if(productRepository.count()==0)
		{
			productRepository.save(new Product("Apple", 128, "https://images.unsplash.com/photo-1567306226416-28f0efdc88ce?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", "500 g"));
			productRepository.save(new Product("Grapes", 180, "https://images.unsplash.com/photo-1508255493836-28a00e7d7f71?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", "1 kg"));
			productRepository.save(new Product("Cherry", 148, "https://images.unsplash.com/photo-1530176611600-d05a6387d07c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", "250 g"));
			productRepository.save(new Product("Pineapple", 65, "https://images.unsplash.com/photo-1550828520-4cb496926fc9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", "1 piece"));
			productRepository.save(new Product("Strawberry", 58, "https://images.unsplash.com/photo-1586266196850-8f11e16e2e55?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", "1 box"));
			productRepository.save(new Product("Sweet Lime", 78, "https://images.unsplash.com/photo-1461534204375-bd3ba51cca78?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", "6 pieces"));
			productRepository.save(new Product("Orange", 108, "https://images.unsplash.com/photo-1560749605-cebc04c2697c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", "6 pieces"));
			productRepository.save(new Product("Banana", 40, "https://images.unsplash.com/photo-1543218024-57a70143c369?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", "6 pieces"));
			productRepository.save(new Product("Pomegranate", 82, "https://images.unsplash.com/photo-1567599598489-8217ffe8f390?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", "500 g"));
		}
	}

}
