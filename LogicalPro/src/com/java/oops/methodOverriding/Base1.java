package com.java.oops.methodOverriding;

public class Base1 {
	int i=10;
	{
		methodOne();
		System.out.println("base class first instance block");
	}
	Base1(){
		System.out.println("base class constructor");
	}
	public static void main(String[] args) {
		Base1 base1 = new Base1();
		System.out.println("base class main() ");
	}
	private void methodOne() {
		System.out.println(j);
	}
	int j=10;
	{
		//methodOne();
		System.out.println("base class second instance block");
	}
}
