package com.xyz.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.project.model.CartItem;

public interface CartRepository extends CrudRepository<CartItem, Integer> {

}
