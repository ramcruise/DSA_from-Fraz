package com.java.multithreading;

public class MyThreadYield extends Thread{
	

	@Override
	public void run() {
		System.out.println("child thread "+Thread.currentThread().getPriority());
		for(int i=0;i<5;i++) {
			System.out.println("child thread");
		}
	}

	public static void main(String[] args) {
		MyThreadYield th =new MyThreadYield();
		th.start();
		Thread.yield();
		System.out.println("main thread "+Thread.currentThread().getPriority());
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
	}

}
