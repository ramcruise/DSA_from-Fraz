package com.java.oops.methodOverriding;

import java.io.IOException;

public class Child extends Parent{
	public String methodone() {
		return "this is String";
	}
	public static void main(String[] args)    {
		Child c = new Child();
		String o = c.methodone();
		System.out.println(o);
	}
}
