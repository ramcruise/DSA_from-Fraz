package com.java.String;

import java.util.Scanner;

//count number of vowels int given string
public class CountNumOfVowels {

	public static void main(String[] args) {
		int count = 0;
		int count2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		System.out.println(str);
		
		for(int i =0; i<str.length();i++) {
			char c = str.charAt(i);
			c = Character.toUpperCase(c);
			//counting number of vowels
			if(c == 'a'|| c == 'e'|| c == 'i'|| c == 'o'|| c == 'u') {
				count++;
			}
			//counting number of WhiteSpace and DIgits
			if(Character.isWhitespace(c)|| Character.isDigit(c)) {
				count2++;
			}
		}
		
		System.out.println("Num of count vowels : "+count);
		System.out.println("Num of count vowels : "+count2);
	}

}
