package com.java.String;

public class CompareStringDemo_7 {
	static boolean  isCompare = true;
	public static void main(String[] args) {
		String st1 = "rambabu";
		String st2 = "rambabu";
		
		isCompare = isStringEqualorNot(st1, st2);
		System.out.println("Given Strings are equal : "+isCompare);

	}

	private static boolean isStringEqualorNot(String st1, String st2) {
		for (int i = 0; i < st1.length(); i++) {
			if (st1.charAt(i) != st2.charAt(i)) {
				isCompare= false;
				break;
			}
			//isCompare= true;
		}
		return isCompare;
	}
}
