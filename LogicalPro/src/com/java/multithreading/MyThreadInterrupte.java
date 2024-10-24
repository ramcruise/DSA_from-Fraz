package com.java.multithreading;

public class MyThreadInterrupte extends Thread{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Thread interrupted : "+e);
			}
		}
	}

	public static void main(String[] args) {
		MyThreadInterrupte th = new MyThreadInterrupte();
		th.start();
		th.interrupt();
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
	}

}
