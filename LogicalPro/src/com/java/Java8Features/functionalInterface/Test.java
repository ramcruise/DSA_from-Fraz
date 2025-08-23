package com.java.Java8Features.functionalInterface;

import com.java.Java8Features.A;

public class Test {

	public static void main(String[] args) {
		A i = (a,b)->System.out.println("The sum "+(a+b));
		 i.sum(5, 6);
	}

}
