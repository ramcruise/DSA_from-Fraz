package com.java.Java8Features.LogicalQuestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class WiproJava8CodingQuestions {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		createEmployeeList(employeeList);
		//System.out.println(employeeList);
		
		//program to print Max/Min employee salary from given collection
		System.out.println("==========max sal==========");
		 Optional<Employee> higestSalaryEmp = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		 System.out.println(higestSalaryEmp);
		 
		 System.out.println("==========min sal==========");
		 Optional<Employee> minimumSalaryEmp = employeeList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)));
		 System.out.println(minimumSalaryEmp);
		 
		 System.out.println("==========max sal from each dept==========");
		 //program to print the max salary from each department
		  Map<String, Optional<Employee>> employeeWithHigestSalaryInDept = employeeList.stream().collect(Collectors.
				  groupingBy(Employee::getDepartment, Collectors.reducing(BinaryOperator.
				  maxBy(Comparator.comparing(Employee::getSalary)))));
		  //System.out.println(employeeWithHigestSalaryInDept);
		  employeeWithHigestSalaryInDept.forEach((key,val)-> System.out.println(key+" "+val));
		  
		  System.out.println("==========active and inactive==========");
		  //program to print active/in-active employees in the given collection
		 Map<String,Long> activeInactiveCount = employeeList.stream().collect(Collectors.
				  groupingBy(Employee::getActive,Collectors.counting()));
		 activeInactiveCount.forEach((key,val)->System.out.println(key+" "+val));
		 
		 System.out.println("==========emp count working in each department==========");
		  //program to print employee count working in each depart in the given collection
		 Map<String, Long> employeeCountEachDept= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		 employeeCountEachDept.forEach((key,val)->System.out.println(key+" "+val));
		 
		 System.out.println("==========emp details working in each department==========");
		  //program to print employee count working in each depart in the given collection
		 Map<String, List<Employee>> employeeDetailEachDept= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		 employeeDetailEachDept.forEach((key,val)->System.out.println(key+" "+val));
		 
		 
	}
	
	private static void createEmployeeList(List<Employee> employeeList) {
		employeeList.add(new Employee(111, "Naveen", 32, "No", "HR",2011, 2000.0));
		employeeList.add(new Employee(112, "Ram", 33, "Yes", "Product development",2012, 2100.0));
		employeeList.add(new Employee(113, "Shaym", 22, "No", "Sales",2021, 3000.0));
		employeeList.add(new Employee(114, "Mohan", 34, "Yes", "Developer",2013, 2500.0));
		employeeList.add(new Employee(115, "John", 30, "No", "QA",2014, 2600.0));
		employeeList.add(new Employee(116, "Vicky", 52, "Yes", "HR",2013, 4000.0));
	}

}
