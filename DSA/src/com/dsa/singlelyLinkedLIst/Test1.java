package com.dsa.singlelyLinkedLIst;

import java.util.HashMap;

public class Test1 {

	public static void main(String[] args) {
		String str = "abcadefghijklm";
		
		HashMap<String,Integer> hashMap = new HashMap<>();
		char[] c = str.toCharArray();
		for(Character ch : c) {
			hashMap.containsKey(ch ? hashMap.containsKey(ch) :hashMap.get(ch)+1);
			
			
				
			
		}
		
	}

}
