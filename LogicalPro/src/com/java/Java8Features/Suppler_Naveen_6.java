package com.java.Java8Features;

import java.util.function.Supplier;

public class Suppler_Naveen_6 {

	public static void main(String[] args) {
		//no argument and return a result
		
		getText(() -> "Java");
		
		
	}

	private static void getText(Supplier<String> text) {
		System.out.println(text.get().length());
	}

}
