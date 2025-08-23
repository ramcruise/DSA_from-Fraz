package com.java.Java8Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java.Java8Features.Customer;

public class StreamFilterMap {

	public static void main(String[] args) {
		List<Customer> customerList = Arrays.asList(
				new Customer("Ram",32),
				new Customer("Raj",31),
				new Customer("Vikas",40),
				new Customer("Mohan",29)
				);
		//1
		String custList = customerList.stream()
		.filter((data) -> data.getAge() > 30)
		.map(Customer::getName)
		.findAny()
		.orElse(null);
		
		System.out.println(custList);
		//2
		List<String> custList1 = customerList.stream()
				.filter((data) -> data.getAge() > 30)
				.map(Customer::getName)
				.collect(Collectors.toList());
				
				custList1.forEach(data -> System.out.println(data));
	}

}
