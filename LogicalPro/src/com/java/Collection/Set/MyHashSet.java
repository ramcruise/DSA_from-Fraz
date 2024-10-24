package com.java.Collection.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("Alpha");
		set1.add("beta");
		set1.add("Testing");
		set1.add("Gama");
		set1.add("Alpha");
		System.out.println(set1);
		
		System.out.println(set1.contains("Testing"));
		
		for(String str:set1) {
			System.out.println(str);
		}
		
		System.out.println("==================");
		Iterator<String> itr = set1.iterator();
		while(itr.hasNext()) {
			String str1 =itr.next();
			System.out.println(str1);
		}
		
		set1.remove("Gama");
		System.out.println(set1);
		
		System.out.println("================");
		
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,3,4,5,6,8,9,10}));
		
		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {1,2,3,5,6,7,9}));
		
		//get Union
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);
		
		System.out.println("=====================");
		//get Intersection elements
				Set<Integer> intersection = new HashSet<Integer>(first);
				intersection.retainAll(second);
				System.out.println(intersection);
				
				System.out.println("=====================");	
		//differences 
				Set<Integer> diff = new HashSet<Integer>(first);
				diff.removeAll(second);
				System.out.println(diff);
		
	}

}
