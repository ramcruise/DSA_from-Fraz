package com.java.Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate_Naveen_5 {

	public static void main(String[] args) {
		//This is a functional interface and can therefore be used as the assignment target 
		//for a lambda expression or method reference.
		
		Predicate<Integer> func  = x -> x>5;
		
		List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> lst2  = lst.stream().filter(func).collect(Collectors.toList());
		System.out.println(lst2);
		
		//Predicate with &&:
		List<Integer> lst3  = lst.stream().filter(x -> x>5 && x<9).collect(Collectors.toList());
		System.out.println(lst3);
		
		//Predicate with neglate():
		List<String> lst4 = Arrays.asList("Naveen","Navee","Java","Jav","Ja","J");
		Predicate<String> nameExp = x -> x.startsWith("Nav");
		
		 List<String> filterName= lst4.stream().filter(nameExp).collect(Collectors.toList());
		System.out.println(filterName);
		
	} 
 
 }