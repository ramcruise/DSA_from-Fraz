package com.java.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CoundDuplicateStringChar_10 {

	public static void main(String[] args) {
		String str= "rammabbu";
		char val = getFirstNonRepeatedChar(str);
		System.out.println("first non repeated charcter "+val);
		
		
		Map<String,Long> out = str.chars().mapToObj( x -> (char)x).
				collect(Collectors.groupingBy(Object::toString,Collectors.counting()));
		for(Entry<String, Long> entry : out.entrySet()) {
			if(entry.getValue()>=2){
				System.out.println(entry.getKey()); 
			}
		}
		/*
		 * out.forEach((key1,val1) ->{ if(key1.equals(1)) { System.out.println("=====");
		 * System.out.println(key1 +" "+val1); } });
		 */
	}

	private static char getFirstNonRepeatedChar(String str) {
		Map<Character,Integer> countMap = new LinkedHashMap<Character,Integer>();
		for(char ch: str.toCharArray()) {
			countMap.put(ch, countMap.containsKey(ch) ? countMap.get(ch)+1 : 1);
			
		}		
		for(Entry<Character, Integer> entry : countMap.entrySet()) {
			if(entry.getValue()==1){
				return entry.getKey();
			}
		}
		throw new RuntimeException("Didn't find any non repeated character"); 
	
	}

}
