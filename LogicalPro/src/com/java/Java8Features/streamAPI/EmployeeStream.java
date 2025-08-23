package com.java.Java8Features.streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStream {

	public static void main(String[] args) {
	List<Integer> intLIst=	Arrays.asList(2,3,4,5,6,7,2,3,4,8);
		intLIst.forEach(data -> System.out.println(data));
		System.out.println("=================");
		List<Integer> disList = intLIst.stream().distinct().collect(Collectors.toList());
		disList.forEach(data -> System.out.println(data));
		System.out.println("======================");
		
		
		List<Employee> empList = Arrays.asList(
				new Employee(1, "Ram"),
				new Employee(3, "Mohan"),
				new Employee(2, "JOhn"),
				new Employee(1, "Ram")
				);
		System.out.println(empList);
		System.out.println("=======Sorted by id===========");
	List<Employee> empList2	= empList.stream().sorted((e1,e2) -> e1.getId()-e2.getId()).collect(Collectors.toList());
	empList2.forEach(data -> System.out.println(data));
	
	System.out.println("=======remove duplicate id===========");
	List<Employee> empList3	= empList.stream().filter(n -> n.getId() >1).distinct().collect(Collectors.toList());
	empList3.forEach(data -> System.out.println(data));
	
	
	}

}
