package com.pvr.shopping.impleordering;

import com.pvr.shopping.sampleinterface.Order;

public class MobileTools implements Order{
	
	private static MobileTools mobileTools = new MobileTools();
	
	
	
	public static MobileTools getMobileTools() {
		return mobileTools;
	}

	public static void setMobileToolst(MobileTools mobileTools) {
		MobileTools.mobileTools = mobileTools;
	}

	private MobileTools() {
		
	}
	
	@Override
	public void ordering() {
		System.out.println("I'm Buying Mobile Tools");
	}
}
