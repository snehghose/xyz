package com.xyz.project.model;

import java.util.List;

public class Cart {
	
	private List<CartItem> cartItems;
	private double total;
	
	public Cart() {
		super();
	}
	
	public Cart(List<CartItem> cartItems, double total) {
		super();
		this.cartItems = cartItems;
		this.total = total;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
