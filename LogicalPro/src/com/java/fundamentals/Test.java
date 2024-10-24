package com.java.fundamentals;

public class Test {
	int a = 10;
	public static void main(String[] args) {
		//System.out.println(a);
		int j;
		Test t = new Test();
		System.out.println(t.a);
		//System.out.println(j);
		System.out.println(10/0.0);
		System.out.println(0.0/0.0);
		t.assetVal();	
	}
	
	public void assetVal() {
		System.out.println("info about asset val.");
	}

}
