package com.java.String;

public class Annagram_1 {

	public static void main(String[] args) {
		String str1 = "aab";
		String str2 = "baa";
		boolean val = isAnnagram(str1,str2);
		System.out.println(val);
	}

	private static boolean isAnnagram(String str1, String str2) {
		int count[] = new int[256];
		for(int i=0;i<str1.length();i++) {
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		return true;
	}

}
