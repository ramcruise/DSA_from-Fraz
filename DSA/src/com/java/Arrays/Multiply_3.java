package com.java.Arrays;

import java.util.Scanner;

//Multiply the given array


public class Multiply_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] arr1 = new int[a][b];
		int[][] arr2 = new int[b][c];
		
		//
		for(int i=0;i<a; i++) 
			for(int j=0; j<b; j++) {
				arr1[i][j] = sc.nextInt();
			}
		
		//
		for(int i=0;i<b; i++) 
			for(int j=0; j<c; j++) {
				arr1[i][j] = sc.nextInt();
			}
		
		
		

	}

}
