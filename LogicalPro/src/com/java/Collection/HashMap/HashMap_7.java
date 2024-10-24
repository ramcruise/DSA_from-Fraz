package com.java.Collection.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_7 {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		ArrayList<String> companyEmp = new ArrayList<String>();
		ArrayList<Integer> companyName = new ArrayList<Integer>();
		map.put("Google",1000);
		map.put("Apple", 2000);
		map.put("Facebook", 3000);
		map.put("Amazon", 4000);
		
	Set s =	map.keySet();
	 Iterator itr = s.iterator();
	 while(itr.hasNext()) {
		 String key = (String) itr.next();
		 companyEmp.add(key);
		 companyName.add(map.get(key));
		 
	 }
	 
	 System.out.println("Company name : "+companyEmp);
	 System.out.println("Number of emp in company : "+companyName);
	}

}
