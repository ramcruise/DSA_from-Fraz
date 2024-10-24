package com.java.Collection.ArrayList;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> markList = new ArrayList<Integer>();
		
		markList.add(100);
		markList.add(300);
		markList.add(500);
		markList.add(600);
		System.out.println(markList);
		
		ArrayList<Double> arrD = new ArrayList<Double>();
		arrD.add(12.4);
		arrD.add(1.4);
		System.out.println(arrD);
		
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Rambabu");
		studentNames.add("Mohan");
		studentNames.add("John");
		System.out.println(studentNames);
	}

}
