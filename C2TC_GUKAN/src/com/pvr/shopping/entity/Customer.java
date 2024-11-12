package com.pvr.shopping.entity;

public class Customer {
	private String name;
	private int id;
	private String city;
	private String product;
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "ComputerTools [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	
}
