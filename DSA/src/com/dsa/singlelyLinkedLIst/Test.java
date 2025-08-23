package com.dsa.singlelyLinkedLIst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int[] arr1 = {2,3,4,5,6,78,12};
		int[] arr2 = {2,79};
		List<Integer> list1 = new ArrayList<>();
		
		boolean flag = false;
		int count = 0;
		for(int i =0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr2[j]==arr1[i]) {
					//list1.add(arr2[i]);
					count++;
				}
			}
		}
		
		for(int i =0;i<arr1.length;i++) {			
			if(arr2[i]==arr1[i]) {
				count++;
			}
		}
		
		if(count==2) {
			flag = true;
		}
		System.out.println("common elements : "+flag);
		//list1.forEach(s->System.out.println(s));
	}

}
