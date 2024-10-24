package com.java.multithreading;

public class DemonThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("child method");
	}
	
	public static void main(String[] args) {
		
		DemonThread d1 = new DemonThread();
		d1.setDaemon(true);
		d1.start();
		for(int i=0;i<5;i++)
			System.out.println("main method");
	}
	

}
