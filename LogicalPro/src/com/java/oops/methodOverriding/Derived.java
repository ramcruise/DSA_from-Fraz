package com.java.oops.methodOverriding;

public class Derived extends Base {
	static int x =100;
	static {
		methodTwo();
		System.out.println("derived class first static block");
	}
	public static void main(String[] args) {
		methodTwo();
		System.out.println("derived class main method");
	}
	private static void methodTwo() {
		System.out.println(y);
	}
	
	static {
		System.out.println("derived class second static block");
	}
	static int y=200;
}
