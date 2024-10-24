package com.java.oops;

public class TestSingleton {
	
	public static void main(String[] args) {
		Test t1 = null;
		Test t = t1.getInstance();
		Test t2 = Test.getInstance();
		System.out.println(t.hashCode());
		System.out.println(t2.hashCode());
		
		
	}

}
