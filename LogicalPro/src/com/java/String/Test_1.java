package com.java.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test_1 {

	public static void main(String[] args) {
		String name = "rambmabuyadav";
		//List<String>   = name.toCharArray(); 
		Map<String,Long> out = name.chars().mapToObj( x -> (char)x).
				collect(Collectors.groupingBy(Object::toString,Collectors.counting()));
		 out.forEach((key,val) -> {
		 	if(val==1)
		 System.out.println(key +" "+val);});
		 
		 Integer i = new Integer(100);
		 Character ch = new Character('c');
		 System.out.println(ch.equals('c'));
		 System.out.println("====================");
		 String[] name2 = {"rambabu"};
		 Map<String, Long> val1 = Arrays.stream(name2).collect(Collectors.groupingBy(Object::toString,Collectors.counting()));
		 val1.forEach((key,val) -> {			 	
			 System.out.println(key +" "+val);});
	}

}
