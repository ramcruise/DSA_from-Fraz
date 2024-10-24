package com.java.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperator_Naveen_5 {

	public static void main(String[] args) {
		//This is a functional interface and can therefore be used as the assignment target 
		//for a lambda expression or method reference.
		UnaryOperator<Integer> func = x -> x*2;
		int val = func.apply(2);
		System.out.println(val);
		
		Function<Integer,Integer> func2 = x->x*3;
		int val2 = func2.apply(3);
		System.out.println(val2);
		
		List<String> lst = new ArrayList<String>();
		lst.add("Java");
		lst.add("Ruby");
		lst.add("Python");
		lst.add("Go Lang");
		
		System.out.println(lst);
		lst.replaceAll(ele -> ele +" Ram");
		System.out.println(lst);
	}

}
