package com.java.Java8Features.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate_Naveen_5 {

	public static void main(String[] args) {
		//This is a functional interface and can therefore be used as the assignment target 
		//for a lambda expression or method reference.
		
		Predicate<Integer> func = (a) -> a > 5;
		
		List<Integer> list = Arrays.asList(2,4,3,1,5,6,7,8,9);
		List<Integer> collectList = list.stream().filter(func).collect(Collectors.toList());
		System.out.println(collectList);
		
		//predicate with && operator
		List<Integer> collList2 = list.stream().filter((a) -> a > 5 && a < 9).collect(Collectors.toList());
		System.out.println(collList2);
		
		//negate()
		Predicate<String> names = (a) -> a.startsWith("Nav");
		List<String> lan = Arrays.asList("Naveen","Navee","Nave","Java","Python","Go");
	    List<String> collNames = lan.stream().filter(names.negate()).collect(Collectors.toList());
	    System.out.println(collNames);
	}
	
 
 }