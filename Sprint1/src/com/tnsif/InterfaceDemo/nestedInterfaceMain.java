package com.tnsif.InterfaceDemo;

public class nestedInterfaceMain {

	public static void main(String[] args) {
		MyInterface.myinnerinterface n = new NestedInterface();
		
		n.print();
		System.out.println(NestedInterface.id);

	}

}
