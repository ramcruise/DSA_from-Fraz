package com.java.Java8Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollect {

	public static void main(String[] args) {
		List<String> productList = Arrays.asList("MacBook","iPhone","Shoes","Battery Charger","Bat");
		productList.forEach((show) -> System.out.println(show));
		
	 List<String> result = productList.stream()
			 .filter(  (data) -> !data.equals("Shoes"))
			 .collect(Collectors.toList());
	 //result.forEach(System.out::println);
	 
	 result.forEach((data) -> System.out.println(data));
	}

}
