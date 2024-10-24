package com.java.multithreading;

public class MyThreadJoin extends Thread{
	static Thread mainThread;
	@Override
	public void run() {
		/*
		 * try { mainThread.join(); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		for(int i=0;i<5;i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		MyThreadJoin th = new MyThreadJoin();
		mainThread = Thread.currentThread();
		th.start();
		
		  try { 
			  th.join(); 
			  } catch (InterruptedException e) { // TODO Auto-generated
		  e.printStackTrace(); }
		 
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
		
	}

}
