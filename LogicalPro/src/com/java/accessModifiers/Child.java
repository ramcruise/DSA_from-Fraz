package com.java.accessModifiers;

public class Child extends Parent{

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Child ch = new Child();
		ch.property();
		
		Parent p = new Parent();
		p.property();
		Parent p1 = new Child();
		p1.property();
		//Child ch1 = new Parent(); 
		
		/*
		 * Child ch2 = (Child)ch.clone(); ch2.calculate();
		 */
		
	}
	
	@Override
	public void property() {
		System.out.println("CHild's property");
	}


	public int calculate() {
		int x = 10;
		int y = x + + + + + x;
		calculate2();
		return y;
	}
	
	public int calculate2() {
		int x = 10;
		int y = x + + + + + x;
		return y;
	}
	

}
