package com.dsa.string;

import java.util.Scanner;

public class MostRecurrsiveCharacter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the str");
		String str = s.next();
		int[]  freq = new int[256];
		
		for(int i=0;i<str.length();i++) {
			int id = str.charAt(i);
			freq[id]++;
		}
		
		int max_id = -1 ;
		int max_f = -1;
		
		for(int i=0;i<256;i++) {
			if(freq[i]>max_f) {
				max_f = freq[i];
				max_id = i;
			}
		}
		System.out.println((char)max_id);
		
	}

}
