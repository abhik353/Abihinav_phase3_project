package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Report {
	@Id
	private int id;
	private String name;
	private String date;
	private String product;
	private String category;
	
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "Report [id=" + id + ", name=" + name + ", date=" + date + ", product=" + product + ", category="
				+ category + "]";
	}
	public Report(int id, String name, String date, String product, String category) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.product = product;
		this.category = category;
	}
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
}
