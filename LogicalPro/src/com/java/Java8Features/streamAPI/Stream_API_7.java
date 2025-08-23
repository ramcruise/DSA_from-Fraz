package com.java.Java8Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_API_7 {

	public static void main(String[] args) {
		List<String> productList = Arrays.asList("MacBook", "iPhone", "Shoes", "Battery charger", "Bat");
		List<String> result = productList.stream()
				.filter((ele) -> !ele.equals("Shoes"))
				.collect(Collectors.toList());

		result.forEach(ele -> System.out.println(ele));

	}

}
