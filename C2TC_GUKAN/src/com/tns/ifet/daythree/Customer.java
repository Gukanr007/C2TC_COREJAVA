package com.tns.ifet.daythree;

import java.util.Scanner;

public class Customer {
	private String cusName;
	private int cusNo;
	private String cusCity;
	

	public String getCusName() {
		return cusName;
	}


	public void setCusName(String cusName) {
		this.cusName = cusName;
	}


	public int getCusNo() {
		return cusNo;
	}


	public void setCusNo(int cusNo) {
		this.cusNo = cusNo;
	}


	public String getCusCity() {
		return cusCity;
	}


	public void setCusCity(String cusCity) {
		this.cusCity = cusCity;
	}


	public Customer() {
		super();
		System.out.println("Constructor Called!");
		// TODO Auto-generated constructor stub
	}


	public Customer(String cusName, int cusNo, String cusCity) {
		super();
		this.cusName = cusName;
		this.cusNo = cusNo;
		this.cusCity = cusCity;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ob = new Customer();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer Name: ");
		ob.setCusName(sc.nextLine());
		
		System.out.println("Enter Customer No: ");
		ob.setCusNo(sc.nextInt());
		
		System.out.println("Enter Customer City: ");
		ob.setCusCity(sc.next());
		
		System.out.println();
		
		System.out.println(ob.toString());
		
		Customer ob1 = new Customer("Jack",29,"USA");
		System.out.println(ob1.toString());
		
		
		

	}


	@Override
	public String toString() {
		return "Customer Details \ncusName=" + cusName + ",\ncusNo=" + cusNo + ",\ncusCity=" + cusCity ;
	}

}
