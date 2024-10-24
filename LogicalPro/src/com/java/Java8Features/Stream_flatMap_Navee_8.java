package com.java.Java8Features;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream_flatMap_Navee_8 {

	public static void main(String[] args) {
		String[][] data = new String[][]{
			{"a","b"},
			{"c","d"},
			{"e","f"}
					};
		
		Stream<String[]> result = Arrays.stream(data);
		
		//apply faltMap on result
		 Stream<String> data2 = result.flatMap(x->Arrays.stream(x));//.filter(x -> x.toString().equals("a"));
		 data2.forEach(x -> System.out.println(x));
	}

}
