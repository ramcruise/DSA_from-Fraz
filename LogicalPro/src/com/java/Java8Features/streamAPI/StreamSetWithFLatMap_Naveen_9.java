package com.java.Java8Features.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.Java8Features.Employee;

public class StreamSetWithFLatMap_Naveen_9 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("Ram");
		
		emp1.addDevices("Iphone");
		emp1.addDevices("Samsung9");
		emp1.addDevices("Macbook Pro");
		emp1.addDevices("Car");
		
		Employee emp2 = new Employee();
		emp2.setName("Tom");
		
		emp2.addDevices("Lenevo windows19");
		emp2.addDevices("Samsung10");
		emp2.addDevices("iPhone9");
		emp2.addDevices("Macbook Pro");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		
		System.out.println(empList);
		System.out.println("==================");
		List<String> deviceList = empList.stream()
			   .map(x -> x.getDevices()) //Stream<Set<String>>
			   .flatMap(x -> x.stream()) // Stream<String>
			   .distinct()
			   .collect(Collectors.toList());
		
		deviceList.forEach(x -> System.out.println(x));
		
	}

}
