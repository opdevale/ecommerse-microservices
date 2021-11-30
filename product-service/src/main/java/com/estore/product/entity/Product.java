package com.estore.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private long productId;
	private String description;
	private String productName;
	private double price;
	private int quantity;
	private String company;
	private int year;
	
	private String fileName;
	private String contentType;
	
	@Column(name = "image", length = 999999999)
	private byte[] image;
}



