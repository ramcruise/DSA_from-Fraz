package com.java.Java8Features;

import java.util.function.BinaryOperator;

public class BinaryOperator_Naveen_4 {

	public static void main(String[] args) {
		
		//Represents an operation upon two operands of the same type, 
		//producing a result of the same type as the operands. 
		//This is a specialization of BiFunction for the case where the operands and 
		//the result are all of the same type.
		
		BinaryOperator<Integer> func = (x1,x2)-> (x1+x2);
		int val = func.apply(20, 20);
		System.out.println(val);
	}

}
