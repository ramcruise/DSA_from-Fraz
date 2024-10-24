package com.java.Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter_findAny_OrElse_8 {

	public static void main(String[] args) {
		List<Customer> customer = Arrays.asList(
									new Customer("Ram", 21),
									new Customer("Mohan", 20),
									new Customer("John", 24),
									new Customer("Raj", 53)
									);
		//filter(),findAny(),orElse()
		Customer filterCustmoer = customer.stream()
				.filter(x -> x.getName().equals("Raj"))
				.findAny()
				.orElse(null);
		System.out.println(filterCustmoer.getName());
		
		System.out.println("=============");
		//map()
		List<String> result = customer.stream()
				.filter(x -> x.getName().equals("Ram"))
				.map(x -> x.getName()+" Yadav")
				.collect(Collectors.toList());
		System.out.println(result);
 	}

}
