package com.dsa.arrays;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("A");
		arrList.add("B");
		arrList.add(1, "C");
		System.out.println(arrList);

	}

}
