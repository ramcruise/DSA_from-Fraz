package com.java.exception;

import java.io.FileInputStream;

public class CheckedException {

	public static void main(String[] args) {
		//FileInputStream f1 = new FileInputStream("d:/abc.txt");
		try {
			System.out.println("staring");
			System.out.println(10/0);
			System.out.println("here");
		} catch (Exception e) {
			System.out.println("expection raised and its catch block");
		}finally {
			System.out.println("finally block");
		}
		System.out.println("end");
	}

}
