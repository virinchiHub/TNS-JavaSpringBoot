package com.tnsif.InterfaceDemo;
// outer interface
public interface MyInterface {
	
	void calculateArea();
	
	interface myinnerinterface{
		int id = 20;
		// public, static & final by-default
		
		void print();
		// public & abstract by-default
	}
}
