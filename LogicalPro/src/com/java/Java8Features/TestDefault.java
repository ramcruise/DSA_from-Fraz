package com.java.Java8Features;

public class TestDefault implements Default_1 ,Default_2{
	public static void main(String[] args) {
		TestDefault t = new TestDefault();
		t.m1();
	}

	@Override
	public void m1() {
		//System.out.println("Test class method");
		Default_1.super.m1();
	}
}
