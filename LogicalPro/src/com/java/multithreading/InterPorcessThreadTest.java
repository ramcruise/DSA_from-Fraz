package com.java.multithreading;

public class InterPorcessThreadTest {

	public static void main(String[] args) {
		InterProcessThread th = new InterProcessThread();
		th.start();
		synchronized (th) {
			try {
				th.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println( "TotoalEarning: "+th.total);
		
	}

}
