package com.java.Java8Features;

import com.java.Java8Features.functionalInterface.InterfStatic;

public class TestStatic implements InterfStatic{
	
//	public static void sum(int a,int b) {
//		System.out.println("The child sum is : "+(a+b));
//	}
	
	public static void main(String[] args) {
		
		TestStatic ts = new TestStatic();
		//ts.sum(10, 20);
		InterfStatic.sum(30, 40);
	}

}
