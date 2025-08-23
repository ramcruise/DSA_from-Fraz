package com.java.Java8Features.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunc_InterfaceConcept_Naveen_5 {

	public static void main(String[] args) {
		//Represents an operation that accepts a single input argument and returns no result.
		
		Consumer<String> func = (x) -> System.out.println(x);
		func.accept("This is Ram here!!");
		
		List<Integer> lst = Arrays.asList(2,3,4,5,6,7,8,9,10);
		lst.forEach((x) -> System.out.println(x));
		
		
		
	}

}
