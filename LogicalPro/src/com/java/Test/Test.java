package com.java.Test;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		HashMap<String,Employee> hs = new HashMap<String,Employee>();
		hs.put("emp1", new Employee(100, "2000", "ram"));
		hs.put("emp2", new Employee(101, "3000", "John"));
		hs.put("emp3", new Employee(102, "5000", "ram"));
		
		
		hs.entrySet().stream().map(m->m.getValue().equals("ram")).collect(Collectors.toMap());
		
		
		
	}

}
