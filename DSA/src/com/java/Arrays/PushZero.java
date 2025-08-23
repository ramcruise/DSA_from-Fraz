package com.java.Arrays;

public class PushZero {

	public static void main(String[] args) {
		int[] arr = {1, 9, 8, 4, 0 ,0,2 };
		int count = 0;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) 
				arr[count++]=arr[i];
		}
			while(count<n) 
				arr[count++]=0;	
				
		
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
