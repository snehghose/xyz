package com.xyz.project.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class CartItem {
	
	@Id
	@Column(name = "ca_id")
	private int id;
	@OneToOne(cascade = {CascadeType.REFRESH, CascadeType.PERSIST})
	@JoinColumn(name = "ca_pr_id")
	private Product product;
	@Column(name = "ca_quantity")
	private int quantity;
	
	public CartItem() {
		super();
	}
	
	public CartItem(int id, Product product, int quantity) {
		super();
		this.id = id;
		this.product = product;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
