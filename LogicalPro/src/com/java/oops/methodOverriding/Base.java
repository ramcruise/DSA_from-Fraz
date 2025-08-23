package com.java.oops.methodOverriding;

public class Base {
	static int i =10;
	static {
	   methodOne();
		System.out.println("base class first static block");
	}
	public static void main(String[] args) {
		methodOne();
		System.out.println("base class main method");
	}
	private static void methodOne() {
		System.out.println(j);
	}
	
	static {
		System.out.println("base class second static block");
	}
	static int j=20;

}
