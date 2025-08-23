package com.java.logical;

import java.util.Arrays;
import java.util.stream.Collectors;

import com.java.Java8Features.streamAPI.Employee;
import com.sun.tools.javac.util.List;

public class Test_2 {

	public static void main(String[] args) {
		//List<Employee-generated method stub
		List<List<Employee>> emplList= Arrays.asList(
				new Employee(id,name,new Manger(id,name,position)),
				new Employee(id,name,new Manger(id,name,position)),
				new Employee(id,name,new Manger(id,name,position))
				);
		
		 List<Manager> listManager = emplList.stream().flatMap(emp -> emp.getManeger()).collect(Collectors.toList());
				
	}

}
