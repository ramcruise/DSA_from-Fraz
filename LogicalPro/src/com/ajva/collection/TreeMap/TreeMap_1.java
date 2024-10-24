package com.ajva.collection.TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMap_1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(100, "Tom");
		map.put(200, "Naveen");
		map.put(300, "Lisa");
		map.put(400, "Raj");
		map.put(500, "Vinod");
		System.out.println(map);
		
		map.forEach((k,v) -> System.out.println("key : "+k+", value : "+v));
		
		System.out.println("=====================");
		System.out.println(map.lastKey());
		System.out.println(map.firstKey());
		
		Set<Integer> keysLessThen3k= map.headMap(300).keySet();
		System.out.println(keysLessThen3k);
		
		System.out.println("=====================");
		Set<Integer> keyGrtThan3k = map.tailMap(300).keySet();
		System.out.println(keyGrtThan3k);
		
		TreeMap<String,Integer> map2 = new TreeMap<String,Integer>();
		map2.put("Tom",1200);
		map2.put("Naveen",200);
		map2.put("Lisa",300);
		map2.put("Raj",400);
		map2.put("Vinod",500);
		System.out.println(map2);
		
		map2.forEach((k,v) -> System.out.println("key : "+k+", value : "+v));
		
	}

}
