package com.java.recursion;

public class First {

	public static void main(String[] args) {
		System.out.println("main method");
		
		float f = (1/4)*10;
		int i = Math.round(f);
		System.out.println(i);
		
		float f1 = (1f/4f)*10f;
		int i1 = Math.round(f);
		System.out.println(i1);
		//func1();
	}

	private static void func1() {
		System.out.println("func1 called");
	}

}
