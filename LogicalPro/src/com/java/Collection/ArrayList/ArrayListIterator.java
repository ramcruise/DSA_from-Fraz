package com.java.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Kumar");
		studentNames.add("John");
		studentNames.add("Love");
		studentNames.add("Arun");
		ArrayList<String> arr2 = new ArrayList<String>();
		
		//for each loop
		for(String name : studentNames) {
			arr2.add(name);
		}
		System.out.println(arr2);
		
		//lamda expression
		studentNames.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("===============Iterator");
		//Iterator
		Iterator<String> itera = studentNames.iterator();
		while(itera.hasNext()) {
			System.out.println(itera.next());
		}
		
		//list with other correction
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(2,3,5,80,90));
		System.out.println(number);
	}

}
