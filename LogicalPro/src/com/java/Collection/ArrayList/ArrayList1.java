package com.java.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		
		//default generics
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rambabu");
		al.add("Ravi");
		System.out.println(al);
		System.out.println(al.get(0));
		//System.out.println(al.get(-1));
		
		System.out.println("============fixed size list=====");
		List<String> ls = Arrays.asList("A","B","C");
		//ls.add("K");
		//ls.remove("C");
		System.out.println(ls);
		
		System.out.println("=====Dynamic size Arrays===========");
		List<String> ls1 = new ArrayList<String>(Arrays.asList("A","B","C"));
		ls1.add("K");
		ls1.remove("C");
		System.out.println(ls1);
	}

}
