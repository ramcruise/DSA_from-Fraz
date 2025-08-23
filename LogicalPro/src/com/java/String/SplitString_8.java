package com.java.String;

import java.util.ArrayList;
import java.util.List;

public class SplitString_8 {
	static List<String> stringList = new ArrayList<String>();
	public static void main(String[] args) {
		String str = "091-1223568978";
		String[] strArr= str.split("-");
		splitGivenString(strArr);
		stringList.forEach((str1) -> System.out.println(str1));
	}

	private static void splitGivenString(String[] strArr) {
		for(String val: strArr) {
			stringList.add(val);
		}
	}

	

}
