package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shoe {
	
	@Id
	private int id;
	private String name;
	private String desc;
	private String category;
	private int size;
	private String price;
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
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
	public String getDesc() {
		return desc;
	}
	
	@Override
	public String toString() {
		return "Shoe [id=" + id + ", name=" + name + ", desc=" + desc + ", category=" + category + ", size=" + size
				+ ", price=" + price + "]";
	}
	public Shoe(int id, String name, String desc, String category, int size, String price) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.category = category;
		this.size = size;
		this.price = price;
	}
	public Shoe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
