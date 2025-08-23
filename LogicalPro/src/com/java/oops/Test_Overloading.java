package com.java.oops;

public class Test_Overloading {

	public static void main(String[] args) {
		Test_Overloading t = new Test_Overloading();
		t.methodOne("ram");
		t.methodOne(new Object());
		t.methodOne(null);
	}

	public void methodOne(String i) {
		System.out.println("String version");
	}

	public void methodOne(Object i) {
		System.out.println("Object version");
	}
}
