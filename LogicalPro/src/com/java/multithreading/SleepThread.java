package com.java.multithreading;

import java.util.Iterator;

public class SleepThread extends Thread{
	

	@Override
	public void run() {
		for(int i =0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("child thread");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		SleepThread s = new SleepThread();
		s.start();
		for(int i =0;i<5;i++)
			System.out.println("main thread");
		
	}

}
