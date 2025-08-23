package com.java.oops.methodOverriding;

public class TestSingleton {

	public static void main(String[] args) {
		System.out.println(Singleton_Class.getInstance().hashCode());//925858445
		System.out.println(Singleton_Class.getInstance().hashCode());//925858445
		System.out.println(Singleton_Class.getInstance().hashCode());//925858445
		
		
	}

}
