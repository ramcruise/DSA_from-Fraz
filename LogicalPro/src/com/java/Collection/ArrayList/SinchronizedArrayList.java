package com.java.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SinchronizedArrayList {

	public static void main(String[] args) {
		
		//1.) Collections.synchronizedList()
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Mohan");
		list.add("Kumar");
		list.add("Arun");
		List<String> synList= Collections.synchronizedList(list);
		
		//add, remove = we do not need explict synchronization
		//To fetch/Traverse the values we need explict synchronization
		String[] arr = new String[list.size()];
		synchronized (synList) {
			Iterator<String> itr = synList.iterator();
			
			while(itr.hasNext()) {
				for(int i=0;i<list.size();i++)
					arr[i]=itr.next();
				//System.out.println(itr.next());
			}
				
			
		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
		System.out.println("===========================");
		//2.) copyOnWriteArrayList = Its a class, this is Thread safe
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<>();
		empList.add("Ram");
		empList.add("Kumar");
		empList.add("Naveen");
		empList.add("John");
		
		//we do not need any explict synchronization for any operation: add/remove/traversal
		Iterator<String> itr= empList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
