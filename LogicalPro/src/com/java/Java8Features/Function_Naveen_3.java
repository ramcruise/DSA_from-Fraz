package com.java.Java8Features;

import java.util.function.Function;

public class Function_Naveen_3 {

	public static void main(String[] args) {
		/**
		Interface Function<T,R> Type parameter:
			T - type of input
			R - type of output
			*/
		Function<String,Integer> func1 = x -> x.length();
        int len = func1.apply("This is java 8 and i am learning");
		System.out.println(len);
		
		//chaining function
		Function<Integer,Integer> func2 = x -> x*2;
		int result = func1.andThen(func2).apply("This is Ram heres");
		System.out.println(result);
		
		
	}

}
