package com.java.String;

import java.util.Scanner;

public class ReverseeString_5 {

	public static void main(String[] args) {
		String str = "Welcome to java world";
		String[] splitArray = str.split(" ");
		for(int i=splitArray.length-1;i>=0;i--) {
			System.out.print(splitArray[i]);
		 }
		
		//System.out.println(reverse);
	}

}
