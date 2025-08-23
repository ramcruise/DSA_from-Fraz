package com.java.declarationAndAccessModi;

public class Final_Test {
	  int i;
	 {
		//i=9;
	}
	public static void main(String[] args) {
	   int k;
	  //System.out.println(k);
		Final_Test t = new Final_Test();
		t.calculate();
		//System.out.println(i);
	}
	public void calculate() {
		System.out.println(i);
	}

}
