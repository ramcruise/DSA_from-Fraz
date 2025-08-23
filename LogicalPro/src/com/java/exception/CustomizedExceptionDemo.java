package com.java.exception;

public class CustomizedExceptionDemo {

	public static void main(String[] args) {
		int age = 61;
		if(age>60) {
			throw new TooOldException("your age already crossed");
		}else if(age<18) {
			throw new TooYoungException("please wait for some more time");
		}else {
			System.out.println("You will get match details soon by email");
		}
	}

}
