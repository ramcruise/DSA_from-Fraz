package com.java.Collection.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		//no order - no indexing
		//stores values -- key-value <k,v>
		//kye can not be duplicate
		//can store multiple null as values, but only one null as key
		HashMap<String,String> capital = new HashMap<String,String>();
		capital.put("India", "New Delhi");
		capital.put("USA", "Washington DC");
		capital.put("UK","London");
		capital.put("UK","London1");
		capital.put(null,"Bernil");
		capital.put(null,"LA");
		capital.put("Russia",null);
		capital.put("France",null);
		
		System.out.println(capital);
		System.out.println(capital.get("India"));
		System.out.println(capital.get("UK"));
		System.out.println(capital.get("France"));
		
		System.out.println("==================");
		
		//iterator: over the key: using keySet()
		 Iterator<String> itr = capital.keySet().iterator();
		 while(itr.hasNext()) {
			String key = itr.next();
			String value = capital.get(key);
			 System.out.println("key: "+key+", value: "+value);
		 }
		 System.out.println("===============================");
		
		 //Iterator: over the set (pair) : using entrySet()
		Iterator<Entry<String,String>> itr1 = capital.entrySet().iterator();
		while(itr1.hasNext()) {
			 Entry<String,String> entry= itr1.next();
			System.out.println("key: "+entry.getKey()+" value: "+entry.getValue()); 
		}
		
		System.out.println("==============");
		//Iterate hashMap using java 8 lamda and foreach loop:
		capital.forEach((k,v)->System.out.println("key: "+k+" value: "+v));
	}

}
