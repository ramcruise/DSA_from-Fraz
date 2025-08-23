package com.java.Java8Features.functionalInterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperator_1 {

	public static void main(String[] args) {
		//Functional Interface:
		//This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
		UnaryOperator<Integer> func1 = (a) -> a*7 ;
		int result = func1.apply(2);
		System.out.println(result);
		
		//as this UnaryOperator is extending Function interface, let try to call direct function interface
		Function<Integer,Integer> fnc2 = (a1) -> a1*2;
		int result2 = fnc2.apply(5);
		System.out.println(result2);
		
		
		ArrayList<String> langList = new ArrayList<String>();
		langList.add("Java");
		langList.add("Python");
		langList.add("Ruby");
		
		System.out.println(langList);
		
		langList.replaceAll(ele -> ele +" RamBabu");
		System.out.println(langList);
		
	}

}
