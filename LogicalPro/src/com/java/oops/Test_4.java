package com.java.oops;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test_4 {

	public static void main(String[] args) {
		System.out.println("enter the val");
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = Arrays.asList(1,3,8,15);
		List<Integer> doubleList  = list.stream().map(val->val*2).collect(Collectors.toList());
	    
	}

}
