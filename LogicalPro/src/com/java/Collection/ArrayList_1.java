package com.java.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("D");
		al.add("C");
		Iterator<String> itr =  al.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
			al.add("D");
		}
		
	}

}
