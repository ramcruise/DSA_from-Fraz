package com.java.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		String[] arr = {"apple","papaya","orange"};
		List<String> arr1= new ArrayList<String>(Arrays.asList(arr));
		arr1.add("cherry");
		arr1.forEach(s->System.out.println(s));
		
		Short a = 128;
		Short b = 128;
		System.out.println(a==b);
		System.out.println(Integer.SIZE);
		
	}

}
