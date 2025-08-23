package com.java.Java8Features.functionalInterface;

import com.java.Java8Features.Drawable;

public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		int width = 10;
		Drawable d = () -> {System.out.println("Draw width : "+width);};
		d.draw();
		
	}

}
