package com.java.multithreading;

public class MyThread4 extends Thread{
	Display d;
	String name;
	
	
	public MyThread4(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}

	public static void main(String[] args) {
		Display d = new Display();
		Display d2 = new Display();
		MyThread4 th = new MyThread4(d, "Dhoni");
		MyThread4 th1 = new MyThread4(d2, "Yuvraj");
		th.start();
		th1.start();
	}

}
