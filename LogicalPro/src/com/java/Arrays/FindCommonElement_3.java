package com.java.Arrays;

/*Write a java program to find common elements in three sorted arrays. 
Find intersection of three sorted arrays.*/

public class FindCommonElement_3 {

	public static void main(String[] args) {
		int[] arr1 = {1,5,10,20,40,80};
		int[] arr2 = {6,7,20,80,100};
		int[] arr3 = {3,4,15,20,30,70,80,120};
		findCommonElements(arr1, arr2, arr3);
		
	}
	public static void findCommonElements(int[] arr1,int[] arr2,int[] arr3) {
		for(int i=0; i <arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				for(int k=0; k<arr3.length; k++) {
					if(arr1[i] == arr2[j] && arr2[j] ==arr3[k]) {
						System.out.println("common element: "+arr1[i]);
					}
				}
			}
		}
		
	}

}
