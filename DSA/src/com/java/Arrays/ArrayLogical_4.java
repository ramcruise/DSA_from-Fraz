package com.java.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

//Find a first duplicate occurrence of a number in an array ?
public class ArrayLogical_4 {

	public static void main(String[] args) {
		Integer[] arr = {2,3,1,4,5,1,6,7,2,3};
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		//System.out.println(list.get(1));
		
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)==list.get(j)) {
					list2.add(list.get(i));
					System.out.println(list.get(i));
					//break;
				}
			}
		}
		
		System.out.println("Third occurence of element : "+list2.get(2));
		
	}

}
