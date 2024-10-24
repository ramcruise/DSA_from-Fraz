package com.java.multithreading;

public class MyThread3 extends Thread{

	@Override
	public void run() {
		for(int i = 0 ;i<5; i++)
			System.out.println("child thread");
	}

	public static void main(String[] args) {
		MyThread3 th3 = new MyThread3();
		
		for(int i = 0 ;i<5; i++)
			System.out.println("main thread");
		th3.start();
		try {
			th3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
