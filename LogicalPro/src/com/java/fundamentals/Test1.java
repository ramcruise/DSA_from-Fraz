package com.java.fundamentals;

public class Test1 {

	public static void main(String[] args) {
		int String = 10;
		System.out.println(String);
		boolean b = true;
		int[] arr =new int[8];
		System.out.println(arr);
		methodOne(10);
		methodOne(10,20);
		methodOne(10,20,30);
	}

	public static void main(int[] args) {
		System.out.println("int args method");
	}
	
	public int[] find() {
		return new int[3];
	}
	
	public static void methodOne(int... x) {
		System.out.println("var-arg method");
		
	}
}
