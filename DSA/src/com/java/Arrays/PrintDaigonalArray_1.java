package com.java.Arrays;

import java.util.Scanner;

//Print Array:
//*) Print first diagonal and second diagonal

public class PrintDaigonalArray_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n ; i++) {
			for(int j=0; j<n ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//Printing main diagonal
		for(int i=0; i<n ; i++)
			System.out.println(arr[i][i]);
		
		//printing second diagonal
		for(int i=n; i>0 ; i--)
			System.out.println(arr[i][n-1]);
		
	}

}
