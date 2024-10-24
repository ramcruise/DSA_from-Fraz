package com.java.Collection.Array.CodingInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare_5 {

	public static void main(String[] args) {
		
		//sort and then compare
		ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> arr3 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		Collections.sort(arr1);
		Collections.sort(arr2);
		
		System.out.println(arr1.equals(arr2));
		Collections.sort(arr3);
		
		System.out.println(arr1.equals(arr3));
		
		//compare two list and find out additional element
		ArrayList<String> arr4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> arr5 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
//		arr4.removeAll(arr5);
//		System.out.println(arr4);
		
		//find out missing element
		arr5.removeAll(arr4);
		System.out.println(arr5);
		
		//find out common element
		ArrayList<String> arr6 = new ArrayList<String>(Arrays.asList("Java","Python","Ruby","C#","JS"));
		ArrayList<String> arr7 = new ArrayList<String>(Arrays.asList("Java","Python","Ruby","C#","PHP"));
		arr6.retainAll(arr7);
		System.out.println(arr6);
	}

}
