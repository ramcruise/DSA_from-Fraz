package com.java.Collection.Array.CodingInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,1,2,3,4,5,6,1,6,3,7));
		//1.) using LinkedHashSet
		
		LinkedHashSet<Integer> numbers2 = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> numWithoutDup = new ArrayList<Integer>(numbers2);
		System.out.println(numWithoutDup);
		
		//2.) Using stream api
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,1,2,3,4,5,6,1,6,3,7));
		List<Integer> list2 = marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(list2);
	}

}
