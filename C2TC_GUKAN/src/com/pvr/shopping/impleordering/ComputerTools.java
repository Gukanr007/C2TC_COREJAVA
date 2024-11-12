package com.pvr.shopping.impleordering;

import com.pvr.shopping.sampleinterface.Order;

public class ComputerTools implements Order {
	
	private static ComputerTools computerTools = new ComputerTools();

	public static ComputerTools getComputerTools() {
		return computerTools;
	}

	public static void setComputerTools(ComputerTools computerTools) {
		ComputerTools.computerTools = computerTools;
	}

	private ComputerTools() {
		
	}
	
	@Override
	public void ordering() {
		System.out.println("I'm Buying Computer Tools");
	}
	

}
