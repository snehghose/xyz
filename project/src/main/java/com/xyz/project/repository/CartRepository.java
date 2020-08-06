package com.xyz.project.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.xyz.project.model.CartItem;
import com.xyz.project.model.Product;

public interface CartRepository extends CrudRepository<CartItem, Integer> {

}
