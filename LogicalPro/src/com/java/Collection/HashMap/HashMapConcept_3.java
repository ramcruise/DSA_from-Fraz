package com.java.Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept_3 {

	public static void main(String[] args) {
		Map<String,Integer> marks = new HashMap<String,Integer>();
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 500);
		
		marks.put(null, 600);
		
		//hashing: hashCode() --> hashing
		
		System.out.println(marks.get("Lias"));
		
		//hashCode of Lisa --> 210678
		//index  =15
		//.equal to check the key name
		//Lisa
		//return value
		
	}

}
