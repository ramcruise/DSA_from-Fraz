package com.java.String;

public class CountNumOfWords_6 {

	public static void main(String[] args) {
		String str = "Welcome to Java world furtunately";
		int wordCount = countNumOfWord(str);
		System.out.println("number of words count : "+wordCount);
	}

	private static int countNumOfWord(String str) {
		int count =0;
		if(str.charAt(0) != ' ') {
			count++;
		}
		for(int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ' ) {
				count++;
			}
		}
		
		return count;
	}

}
