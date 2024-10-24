package com.java.Collection.HashMap;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization_4 {

	public static HashMap<String,Integer> marks;
	static {
		marks = new HashMap<String,Integer>();
		marks.put("A", 100);
		marks.put("B", 200);
		marks.put("C", 300);
	}
	public static void main(String[] args) {
		
		//1.) using HashMap classes
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		Map<String,String> map2 = new HashMap<String,String>();
		
		//2.) static way: static hashMap (Immutable Map)
		System.out.println(marks.get("A"));
		
		//3.) immutable Map with single one entry:
		 Map<String,Integer> map3 = Collections.singletonMap("test", 100);
		 System.out.println(map3.get("test"));
		 //map3.put("A", 200); //exception: UnsupportedOperationException
		 
		 //4.) JDK 8:
		 //Creating one 2D Array of String using Stream and collecting in form of Map
		 Map<String,String> map4 = Stream.of(new String[][] {
			 {"Tom","A Grade"},
			 {"Naveen","A+ Grade"}
		 }).collect(Collectors.toMap(data ->data[0],data -> data[1]));
		 
		 System.out.println(map4.get("Tom"));
		 map4.put("Lisa","A++ Grade");
		 System.out.println(map4.get("Lisa"));
		 
		 //using SimpleEntry : mutable Map
		Map<String,String> map5 = Stream.of(
				 new AbstractMap.SimpleEntry<>("Tom","Java"),
				 new AbstractMap.SimpleEntry<>("Naveen","Python")
				 ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		 
		System.out.println(map5.get("Tom"));
		map5.put("Lisa","C#");
		System.out.println(map5.get("Lisa"));
		 
		//JDK 1.9
		//empty map:
	  //Map<String, String> emptyMap	= Map.of();
	  
//	  Map<String, String> singletonMap	= Map.of("Tom","Java");
//	  System.out.println(singletonMap.get("Tom"));
	}

}
