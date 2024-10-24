package com.java.multithreading;

public class MyThread2 extends Thread {

	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("start method");
	}

	
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		System.out.println("run method");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 th2 = new MyThread2();
		th2.start();
		for(int i=0;i<5;i++)
		System.out.println("main method");

	}
	

}
