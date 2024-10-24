package com.java.multithreading;

public class MyThread5 extends Thread{
	

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}

	public static void main(String[] args) {
		MyThread5 th1 = new MyThread5();
		MyThread5 th2 = new MyThread5();
		
		th1.start();
		th2.start();
	}

}
