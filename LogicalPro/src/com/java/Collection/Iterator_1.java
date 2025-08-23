package com.java.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i =1; i<=10;i++)
			al.add(i);
		
		System.out.println(al);
		
		 Iterator<Integer> i = al.iterator();
		 while(i.hasNext()) {
			   Integer data = i.next();
			   if(data%2==0) {
				   System.out.println(data);
			   }else {
				   i.remove();
			   }
				   
		 }
		 
		 System.out.println(al);
		
	}

}
