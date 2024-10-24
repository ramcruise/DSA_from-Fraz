package com.java.Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_API_7 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java","Python","Macbook","GoLang","Shoes");
		 List<String> result = list.stream()
				 				   .filter(ele -> !ele.equals("Shoes"))
				 				   .collect(Collectors.toList());
		 result.forEach(x -> System.out.println(x));
		
		
	}

}
