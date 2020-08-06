package com.xyz.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.project.model.Cart;
import com.xyz.project.model.CartItem;
import com.xyz.project.model.Product;
import com.xyz.project.repository.CartRepository;
import com.xyz.project.repository.ProductRepository;

@Service
public class CartService {
	
	@Autowired
	private CartRepository cartRepository;
	@Autowired
	private ProductRepository productRepository;
	
	public Cart getCart() {
		List<CartItem> cartItems=new ArrayList<>();
		double total=0.0;
		for(CartItem item:cartRepository.findAll()) {
			cartItems.add(item);
			total+=item.getProduct().getPrice()*item.getQuantity();
		}
		return new Cart(cartItems, total);
	}
	
	public void addToCart(int productId){
		Product product;
		try {
			product = productRepository.findById(productId).orElseThrow(() -> new Exception("Product not found"));
			cartRepository.findAll().forEach((item) -> {
				if(item.getProduct().getId()==productId) {
					final CartItem cart=item;
					cartRepository.deleteById(cart.getId());
					cart.setQuantity(cart.getQuantity()+1);
					cartRepository.save(cart);
					return;
				}
			});
			CartItem cart=new CartItem(product, 1);
			cartRepository.save(cart);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteFromCart(int id) {
		CartItem cart;
		try {
			cart = cartRepository.findById(id).orElseThrow(()->new Exception("Cart Item not found"));
			cartRepository.deleteById(id);
			if(cart.getQuantity()>1) {
				cart.setQuantity(cart.getQuantity()-1);
				cartRepository.save(cart);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
