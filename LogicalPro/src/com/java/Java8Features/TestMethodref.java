package com.java.Java8Features;

public class TestMethodref {

	public static void main(String[] args) {
		Runnable r= MethodReference::methodOne;
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
			System.out.println("Main mtehod");
	}

}
