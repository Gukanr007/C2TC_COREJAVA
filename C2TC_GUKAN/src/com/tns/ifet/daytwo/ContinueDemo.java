package com.tns.ifet.daytwo;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Printing elements from 5 to 15 without odd numbers");
		for (int k = 5; k < 15; k++) 
		  { 
		  // Odd numbers are skipped 
		  if (k%2 != 0) 
		  continue; 
		  // Even numbers are printed 
		  System.out.print(k + " "); 
		  }
	}

}
