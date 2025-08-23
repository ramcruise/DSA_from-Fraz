package com.java.Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListInterator {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Java");
		arrList.add("Scala");
		arrList.add("Python");
		arrList.add("GoLang");
		arrList.add("JavaScript");
		
		//using forEach() method
		System.out.println("=======using forEach() method======");
		
		  arrList.forEach((show) -> { System.out.println(show); });
		 
		System.out.println("========using for each loop==========");
		//using for each loop
		for(String val:arrList) {
			System.out.println(val);
		}
		
		//forEachRemaining
		System.out.println("=====forEachRemaining=========");
		Iterator<String> itr1 = arrList.iterator();
		itr1.forEachRemaining((show) -> {System.out.println(show);});
		
		System.out.println("=========using iterator=========");
		//using iterator
		Iterator<String> itr = arrList.iterator();
		while(itr.hasNext()) {
			String data= itr.next();
			System.out.println(data);
		}
		
		//for loop
		System.out.println("=======for loop========");
		for(int i=0;i<arrList.size();i++)
			System.out.println(arrList.get(i));
		//ListIterator
		System.out.println("=========ListIterator========");
		 ListIterator<String> lstItr = arrList.listIterator();
		 while(lstItr.hasNext()) {
			 String data2 = lstItr.next();
			 System.out.println(data2);
		 }
		
	}

}
