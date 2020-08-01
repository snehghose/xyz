package com.xyz.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.project.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
