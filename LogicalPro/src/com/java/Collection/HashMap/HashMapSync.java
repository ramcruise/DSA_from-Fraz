package com.java.Collection.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		////SynchonizedMap methods in Collections class:
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("1","Tom");
		map1.put("2","Navee");
		map1.put("3","Lisa");
		
		//creating synchronizMap:
		Map<String,String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap);
		
		//ConcurrentHashMap:
		ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();
		concurrentMap.put("Tom", "Java");
		concurrentMap.put("Navee", "Python");
		concurrentMap.put("Lisa", "C#");
		System.out.println(concurrentMap.get("Tom"));
		//concurrentModificationException in case of HashMap.
		//will not get any concurrentModificationException in case of concurrentHashMap.
	}

}
