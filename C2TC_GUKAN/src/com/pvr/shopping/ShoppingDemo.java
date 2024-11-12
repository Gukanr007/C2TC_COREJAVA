package com.pvr.shopping;

import com.pvr.shopping.entity.Customer;
import com.pvr.shopping.impleordering.ComputerTools;
import com.pvr.shopping.impleordering.MobileTools;
import com.pvr.shopping.sampleinterface.Order;

public class ShoppingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		c1.setName("Gukan");
		c1.setCity("Pondy");
		c1.setId(22);
		c1.setProduct("mobileTools");
		
		Order order;
		String choice = c1.getProduct();
		
		if(choice == "mobileTools") {
			order = MobileTools.getMobileTools();
			order.ordering();
		}
		else if(choice == "computerTools") {
			order = ComputerTools.getComputerTools();
			order.ordering();
		}
		

	}

}
