package com.java.Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Enumeration_1 {

	public static void main(String[] args) {
		Vector v = new Vector<Integer>();
		for (int i = 1; i <= 10; i++)
			v.addElement(i);
		
			System.out.println(v);
			
			 Enumeration<Integer> e = v.elements();
			 while(e.hasMoreElements()) {
				 Integer data =  e.nextElement();
				 if(data%2==0)
					 System.out.println(data);
			 }
			 System.out.println(v);
	}

}
