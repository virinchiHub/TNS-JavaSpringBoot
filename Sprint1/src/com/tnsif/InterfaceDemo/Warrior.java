package com.tnsif.InterfaceDemo;

public class Warrior implements Character, weapon {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("attack");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("use");
	}

}
