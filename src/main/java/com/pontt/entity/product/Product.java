package com.pontt.entity.product;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2649557889579818192L;
	
	@Id
	private Long id;
	
	private String name;
	
	private String description;

	public Product(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
