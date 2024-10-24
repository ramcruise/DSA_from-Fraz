package com.java.Collection.List;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Tom");
		list.add("Ram");
		list.add("Lisa");
		list.add("Rajesh");
		
		System.out.println(list);
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String data = itr.next();
			System.out.println(data);
		}
		
		list.add(4, "Vinay");
		System.out.println(list.get(4));
		
		LinkedList<String> users = new LinkedList<String>();
		users.add("Karan");
		users.add("John");
		users.add("Rana");
		System.out.println(users);
		
		list.addAll(users);
		System.out.println(list);
		list.addFirst("Kamal");
		System.out.println(list);
		
		list.addLast("Roby");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		list.removeAll(users);
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		LinkedList<String> language = new LinkedList<String>();
		language.add("Java");
		language.add("Ruby");
		language.add("Python");
		System.out.println(language);
		
		Iterator<String> descData = language.descendingIterator();
		while(descData.hasNext()) {
			System.out.println(descData.next());
		}
		
		for(String str:language) {
			System.out.println(str);
		}
		
		//sort
		Collections.sort(language);
		System.out.println(language);
	}

}
