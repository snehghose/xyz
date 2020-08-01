package com.xyz.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.project.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {

}
