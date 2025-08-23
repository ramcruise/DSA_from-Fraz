package com.java.oops.methodOverriding;

public class Test_Object_creation {
	

	public static void main(String[] args) {
		Test_Object_creation ob = new Test_Object_creation();
		System.out.println(ob);

		try {
			Test_Object_creation ob1 = (Test_Object_creation) ob.clone();
			System.out.println(ob == ob1);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
