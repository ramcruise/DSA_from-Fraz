package com.dsa.basics.Jan11TH;

import java.util.Scanner;

//https://www.codechef.com/problems/WATERCONS
public class WaterCons_1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days");
		int t = sc.nextInt();
		while(t-->0)
		{
			System.out.println("Liter of water");
    		int x = sc.nextInt();
    		// write your code here
    		if(x >= 2000) {
    			System.out.println("Yes");
    		}else
    		{
    			System.out.println("No");
    		}
		}
		
	}

}
