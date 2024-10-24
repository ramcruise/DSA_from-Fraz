package com.java.multithreading;

public class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		System.out.println("child thread");
	}

	public static void main(String[] args) {
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		th2.start();
		th1.start();
		for(int i=0;i<5;i++)
			System.out.println("Main thread");
	}

}
