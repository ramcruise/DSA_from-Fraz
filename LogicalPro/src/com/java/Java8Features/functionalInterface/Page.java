package com.java.Java8Features.functionalInterface;

@FunctionalInterface
public interface Page {
	public void greet(); //only one abstract method
	
	public static void test() {
		
	}
	
	default void display() {
		
	}
}
