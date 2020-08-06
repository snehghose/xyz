package com.xyz.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.project.model.Cart;
import com.xyz.project.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@GetMapping
	public Cart getCart() {
		return cartService.getCart();
	}
	
	@PutMapping("/add/{productId}")
	public void addToCart(@PathVariable int productId) {
		cartService.addToCart(productId);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteFromCart(@PathVariable int id) {
		cartService.deleteFromCart(id);
	}
}
