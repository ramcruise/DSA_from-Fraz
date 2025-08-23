package com.java.Java8Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreams {

	public static void main(String[] args) {
		
		//1
		Stream stream = Stream.of("Naveen","Tom","Ram","John");
	//	stream.forEach(data -> System.out.println(data));
		
		stream.findFirst()
		.ifPresent(System.out::println);
		
		//2
		Arrays.asList("a1","a2","a3").stream()
		.findFirst()
		.ifPresent(System.out::println);
		
		//3 range 1 to 5
		IntStream.range(1, 11).forEach(System.out::println);
		
		//4
		Arrays.stream(new int[] {1,2,3,4})
		.map(n -> 2*n+1)
		.average()
		.ifPresent(System.out::println);
		
		List<Integer> data = Arrays.asList(2,3,4,5,6);
		List<Integer> result = data.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println(result);
		
		//odd number
		Stream.iterate(0, n -> n+1)
		.filter(x -> x%2 !=0)
		.limit(10).forEach(System.out::println);
	}

}
