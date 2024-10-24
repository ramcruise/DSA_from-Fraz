package com.java.Java8Features;

import java.util.function.Consumer;

public class ConsumerFunc_InterfaceConcept_Naveen_5 {

	public static void main(String[] args) {
		//Represents an operation that accepts a single input argument and returns no result.
		
		Consumer<String> func = x -> System.out.println(x);
		func.accept("This is Ram here!!");
		
		
		
	}

}
