package com.java.String;

public class PrintEvenAndOddWord_3 {

	public static void main(String[] args) {
		String str = "Hell World we lol";
		for(String strVal : str.split(" ")) {
			if(strVal.length() % 2==0) {
				System.out.println(strVal);
			}
		}
	}

}
