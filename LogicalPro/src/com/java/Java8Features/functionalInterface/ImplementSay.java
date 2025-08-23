package com.java.Java8Features.functionalInterface;

public class ImplementSay  {

	public static void main(String[] args) {
		Sayable s1 = ()->{return "hi.......Ram";};
		System.out.println(s1.say());
	}

}
