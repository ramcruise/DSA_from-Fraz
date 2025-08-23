package com.java.Java8Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
		
	List<Person> persons	= Arrays.asList(
				new Person("Ram",Arrays.asList("red","blue")),
				new Person("Mohan",Arrays.asList("green")),
				new Person("John",Arrays.asList("yellow","blue")),
				new Person("Rekh",Arrays.asList("sky","pink"))
				);
	
	//Map
	List<List<String>> per = persons.stream()
			.map(Person::getColor)
			.collect(Collectors.toList());
	per.forEach(color -> System.out.println(color));
	System.out.println("=================");
	
	//flatMap
	 List<String> flattendColor = persons.stream().
			 flatMap(pers -> pers.getColor().stream())
			 .collect(Collectors.toList());
	 flattendColor.forEach(color -> System.out.println(color));
	}

}
