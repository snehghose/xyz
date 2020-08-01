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
			productRepository.save(new Product("Sandwich", 149, "https://images.unsplash.com/photo-1528735602780-2552fd46c7af?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=crop&amp;w=1353&amp;q=80", "Main Course"));
			productRepository.save(new Product("Burger", 235, "https://images.unsplash.com/photo-1512152272829-e3139592d56f?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=crop&amp;w=1950&amp;q=80", "Main Course"));
			productRepository.save(new Product("Pizza", 350, "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=crop&amp;w=500&amp;q=60", "Main Course"));
			productRepository.save(new Product("French Fries", 58, "https://images.unsplash.com/photo-1526230427044-d092040d48dc?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=crop&amp;w=500&amp;q=60", "Starter"));
			productRepository.save(new Product("Brownie", 45, "https://images.unsplash.com/photo-1564355808539-22fda35bed7e?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=crop&amp;w=500&amp;q=60", "Dessert"));
		}
	}

}
