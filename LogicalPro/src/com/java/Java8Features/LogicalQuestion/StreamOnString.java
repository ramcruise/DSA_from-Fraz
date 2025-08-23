package com.java.Java8Features.LogicalQuestion;

import java.util.Map;
import java.util.stream.Collectors;

//1.) Find the vowel counts in String
//2.) Find the duplicates in String
public class StreamOnString {

	public static void main(String[] args) {
		String input = "ram babu yadav say hello";
		
		//1.) Find the vowel counts in String
		long countVowel = input.chars().filter((x)->{			
			return (x =='a'|| x =='e'||x =='i'||x =='o'||x =='u');
		}).count();
		//System.out.println(countVowel);
		
		//2.) Find the duplicates in String
		//space is 1 time
		 Map<String,Long> out = input.chars().mapToObj( x -> (char)x).
				collect(Collectors.groupingBy(Object::toString,Collectors.counting()));
		 out.forEach((key,val) -> System.out.println(key +" "+val));
	}

}
