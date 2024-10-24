package com.java.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ArrayLogical_3 {
//Java Program to check whether an element is present in two arrays in given 3 arrays
	public static void main(String[] args) {
		Integer[] arr1 = {1,2,3,9,8,7};
		Integer[] arr2 = {4,1,2,10,15};
		Integer[] arr3 = {5,1,2,4,10};
		
		HashSet<Integer> unique = new HashSet<Integer>();
		 List<Integer> list1 = Arrays.asList(arr1);
		 List<Integer> list2 = Arrays.asList(arr2);
		 List<Integer> list3 = Arrays.asList(arr3);
		 
		 unique.addAll(list1);
		 unique.addAll(list2);
		 unique.addAll(list3);
		 
		 System.out.println(unique);
		 List<Integer> finalList = new ArrayList<Integer>();
		 
		 for(Integer number:unique) {
			 if(list1.contains(number)&&list2.contains(number) || list2.contains(number)&&list3.contains(number) 
					 || list3.contains(number)&&list1.contains(number)) {
				 
				 finalList.add(number);
			 }
		 }
		 
		 System.out.println("The number which is avialable int atleat two arrays :"+finalList);
		
	}

}
