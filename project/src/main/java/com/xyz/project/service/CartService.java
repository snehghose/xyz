package com.xyz.project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
			Optional<CartItem> check=cartRepository.findById(product.getId());
			CartItem item=check.orElse(new CartItem(product.getId(),product,0));
			check.ifPresent(cartItem -> cartRepository.deleteById(cartItem.getId()));
			item.setQuantity(item.getQuantity()+1);
			cartRepository.save(item);
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
