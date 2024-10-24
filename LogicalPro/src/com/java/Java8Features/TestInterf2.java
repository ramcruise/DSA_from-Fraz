package com.java.Java8Features;

public class TestInterf2 {
	
	public void m2(int i) {
		System.out.println("From Method Reference: "+i);
	}
	public static void main(String[] args) {
		Interf2 f = (k) -> {System.out.println("from Lamda expression:"+k);};
		f.m1(10);
		TestInterf2 t = new TestInterf2();
		Interf2 f1 =  t::m2;
		f1.m1(10);
		
	}

}
