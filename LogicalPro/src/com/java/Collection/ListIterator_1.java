package com.java.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_1 {

	public static void main(String[] args) {
		List l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		System.out.println(l);
		
		ListIterator<Integer> litr = l.listIterator();
		while(litr.hasNext()) {
				 int data= (int)litr.next();
				 if(data%2==0) {
					 litr.remove();
				 }
		}
		System.out.println(l);
		
		}

}
