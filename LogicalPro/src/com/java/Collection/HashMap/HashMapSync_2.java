package com.java.Collection.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapSync_2 extends Thread{
	static HashMap<Integer,String> map = new HashMap<Integer,String>();
		//static	ConcurrentHashMap map = new ConcurrentHashMap();
			
			
	@Override
			public void run() {
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				System.out.println("Child Thread updaing Map");
				map.put(600, "Java");
				map.put(700, "Go Lang");
				map.put(800, "Cobol");
			}


	public static void main(String[] args) {
		map.put(100, "Python");
		map.put(200, "C#");
		HashMapSync_2 t = new HashMapSync_2();
		HashMapSync_2 t1 = new HashMapSync_2();
		t.start();
		t1.start();
		
		Set s = map.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Integer key = (Integer) itr.next();
			System.out.println("key: "+key+", value: "+map.get(key));
		}
		
		System.out.println("=================");
		System.out.println(map);
	}

}
