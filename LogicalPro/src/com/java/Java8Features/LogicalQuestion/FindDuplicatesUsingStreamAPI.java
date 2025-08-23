package com.java.Java8Features.LogicalQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesUsingStreamAPI {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(5,3,4,1,3,7,2,9,9);
		
		List<String> strList = Arrays.asList("Amanda","Rob","Sunny","Amanda","Rob");
		
		//count the occurance for numbers
		Map<Integer,Long> numOutput =numList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		numOutput.forEach((key,val) -> System.out.println(key +" "+val));
		
		//count the occurance for String
		System.out.println("============================");
		Map<String, Long> strOutput = strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		strOutput.forEach((key,val) -> System.out.println(key+" "+val));
		
		System.out.println("============================");
		//traditional code
		Map<String, Integer> out = new HashMap<String, Integer>();
		for(String s : strList) {
			if(out.containsKey(s)) {
			int count	= out.get(s);
			count++;
			out.put(s, count);
			}else {
				out.put(s, 1);
			}
		}
		
		out.forEach((key,val)->System.out.println(key+" "+val));
	
	}

}
