package com.java.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String str = "abafdjfhsdsafdfsdfsdfha";
		Character result = findUnique(str);
		System.out.println("First non-repeating character: " + result);
	}

	public static Character findUnique(String str) {
		Map<Character,Integer> freqmap = new LinkedHashMap<>();
		char[] ch = str.toCharArray();
		for(char c : ch) {
			freqmap.put(c, freqmap.containsKey(c) ? freqmap.get(c)+1:1);
		}
		
		 for(Entry<Character,Integer> entrySet : freqmap.entrySet()) {
			  if(entrySet.getValue() ==1) {
				return  entrySet.getKey();
			  }
		 }
		 return null;
	}
}
