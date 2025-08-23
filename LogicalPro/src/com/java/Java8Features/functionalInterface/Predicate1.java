package com.java.Java8Features.functionalInterface;

import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
//		Predicate<Integer> p = i->(i>10);
//		System.out.println(p.test(11));
		Predicate<String> p = s->(s.length()>3);
		System.out.println(p.test("ramc"));
	}

}
