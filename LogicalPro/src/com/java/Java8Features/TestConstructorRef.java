package com.java.Java8Features;

import com.java.Java8Features.functionalInterface.Interf3;
import com.java.Java8Features.functionalInterface.Sample;

public class TestConstructorRef {

	public static void main(String[] args) {
		Interf3 f = s->new Sample(s);
		f.get("From Lamda expression");
		
		Interf3 f2 = Sample::new;
		f2.get("From constructor reference");
	}

}
