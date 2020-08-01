package com.xyz.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pr_id")
	private int id;
	@Column(name = "pr_name")
	private String name;
	@Column(name = "pr_price")
	private double price;
	@Column(name = "pr_image")
	private String imageUrl;
	@Column(name = "pr_category")
	private String category;
	
	public Product() {
		super();
	}
	
	public Product(String name, double price, String imageUrl, String category) {
		super();
		this.name = name;
		this.price = price;
		this.imageUrl = imageUrl;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
