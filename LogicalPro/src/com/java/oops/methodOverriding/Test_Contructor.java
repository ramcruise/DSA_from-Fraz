package com.java.oops.methodOverriding;

public class Test_Contructor {
	static int count = 0;
	{
		count++;
	}

	 Test_Contructor() {
		// TODO Auto-generated constructor stub
	}

	Test_Contructor(int i) {

	}
	public static void main(String[] args) {
		Test_Contructor t1 = new Test_Contructor();
		Test_Contructor t2 = new Test_Contructor(10);
		Test_Contructor t3 = new Test_Contructor();
		System.out.println(count);
	}

}
