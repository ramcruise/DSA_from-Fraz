package com.java.multithreading;

public class MyRunnable implements Runnable{

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread th = new Thread(r);
		th.start();
		for(int i=0;i<5;i++)
		System.out.println("main method");
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		System.out.println("run method");
	}

}
