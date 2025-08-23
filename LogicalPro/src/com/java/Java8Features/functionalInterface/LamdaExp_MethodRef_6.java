package com.java.Java8Features.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamdaExp_MethodRef_6 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ram","Kumar","Naveen","Jaison");
		
		System.out.println("======================");
		//1.) using forEach() and consumer functional interface
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		});
		
		System.out.println("======================");
		//2.) lamda exp
		list.forEach(x -> System.out.println(x));
		
		System.out.println("======================");
		//3.) method reference
		list.forEach(System.out::println);
	}

}
