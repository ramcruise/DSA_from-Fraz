package com.dsa.basics.Jan11TH;

import java.util.Scanner;

//https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
public class ArmstrongNumber_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = s.nextInt();
		String val = armstrongNumber(num);
		System.out.println("Given number is Armstrong num or not : "+val);
	}
	
	public static String armstrongNumber(int num) {
        // code here
        String flag = "false";
        int result = 0;
        int temp = num;
		int sum = 0;
		while(num >= 1) {
			 result = num%10;
			 sum = sum+(result*result*result);
			 num = num/10;
		}
		if(sum==temp) {
			flag = "true";
		}else {
			 flag = "false";
		}
       
       return flag;
    }

}
