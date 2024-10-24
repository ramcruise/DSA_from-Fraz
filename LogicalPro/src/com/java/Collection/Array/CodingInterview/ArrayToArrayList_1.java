
//Convert Arrays to ArrayList
package com.java.Collection.Array.CodingInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList_1 {

	public static void main(String[] args) {
		//first way
		String[] arr1 = {"Ram","Kumar","Naveen","Ajay"};
		ArrayList<String> arr = new ArrayList<String>();
		List<String> arr2 = (List<String>)( Arrays.asList(arr1));
		System.out.println(arr2);
		
		//second way
		List<String> empLists = new ArrayList<String>();
		Collections.addAll(empLists, arr1);
		System.out.println(empLists);
		
		//Third way
		List<String> empLists2 = new ArrayList<String>();
		for(String str:arr1) 
			empLists2.add(str);
		
		System.out.println(empLists2);
		
	}

}
