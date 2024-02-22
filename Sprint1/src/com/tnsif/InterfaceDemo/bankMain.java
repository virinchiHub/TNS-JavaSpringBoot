package com.tnsif.InterfaceDemo;

public class bankMain {
	public static void main(String[] args) {
		Bank s = new SBI();
		System.out.println("ROI at SBI: " + s.rateofinterest());
		
		Bank c = new CBI();
		System.out.println("ROI at CBI: " + c.rateofinterest());
	}
}
