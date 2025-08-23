package com.java.Java8Features.streamAPI;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamConcept {

	public static void main(String[] args) {
	 ForkJoinPool corePool	= ForkJoinPool.commonPool();
	 System.out.println(corePool.getParallelism());//15
	 
	 //Parallel() method on stream 
	 Stream.of("Ram","John","Mohan","Raj").forEach(System.out::println);
	 
	 System.out.println("=========Parallel stream========");
	 Stream.of("Ram","John","Mohan","Raj").parallel().forEach(System.out::println);
	
	//2. use parallelStream() method on collection stream
	 System.out.println("===========");
	 Arrays.asList("Tom","Alice","Rang","Chin")
	 .parallelStream()
	 .forEach(System.out::println);
	 
	 //1 to 10
	 System.out.println("sequencial stream");
	 IntStream.range(1, 11).forEach(System.out::println);
	 
	//1 to 10
		 System.out.println("parallel stream");
		 IntStream.range(1, 11).parallel().forEach(System.out::println);
		 
	 //Check the stream is running into parallel mode : isParallel() method
		 IntStream range = IntStream.rangeClosed(1, 10);
		 System.out.println(range.isParallel());//false
		 
		 IntStream range1 = IntStream.rangeClosed(1, 10);
		 range1.parallel();
		 System.out.println(range1.isParallel());//true
	}

}
