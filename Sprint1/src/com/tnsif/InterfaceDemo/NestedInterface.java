package com.tnsif.InterfaceDemo;

public class NestedInterface implements MyInterface.myinnerinterface{

	@Override
	public void print() {
		System.out.println("Welcome to inner interface");	
	}
	

}
