package com.java.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("Java");
		arr1.add("Python");
		arr1.add("Ruby");
		arr1.add("JavaScript");
		System.out.println(arr1);
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Development");
		arr2.add("Testing");
		
//		arr1.addAll(arr2);
//		arr1.addAll(2, arr2);
//		System.out.println(arr1);
//		
//		arr1.clear();
//		System.out.println(arr1);
		
		ArrayList<String> clonedArrayList = (ArrayList)arr1.clone();
		System.out.println(clonedArrayList);
		System.out.println(arr1.contains("Java"));
		System.out.println(arr1.indexOf("Ruby"));
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Ram","Naveen","Kiran","Vijay"));
		System.out.println(list1);
		
		System.out.println(list1.lastIndexOf("Kiran"));
		list1.remove(1);
		System.out.println(list1);
		list1.remove("Kiran");
		System.out.println(list1);
		
		ArrayList<Number> number1 = new ArrayList<Number>(Arrays.asList(1,2,3,56,78,43,23,56,78,90));
		System.out.println(number1);
		//number1.removeIf(num -> num%2 == 0);
		
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Ram","Naveen","Kiran","Vijay"));
		list2.retainAll(Collections.singleton("Naveen"));
		System.out.println(list2);
		
		ArrayList<Number> subList = new ArrayList<Number>(number1.subList(2, 6));
		System.out.println(subList);
		
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("Ram","Naveen","Kiran","Vijay"));
		
		Object[] arr3 = arr.toArray();
		for(Object obj:arr3)
			System.out.println(obj);
		
	}

}
