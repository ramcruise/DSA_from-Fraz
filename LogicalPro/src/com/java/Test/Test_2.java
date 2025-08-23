package com.java.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test_2 {

	public static void main(String[] args) {
		List<Integer> lit = new ArrayList<Integer>();
		lit.add(12);
		lit.add(13);
		List<Integer> lit2 = new ArrayList<Integer>();
		lit2.add(1);
		lit2.add(2);

	       List<Integer> listSorted=  lit.stream().sorted().collect(Collectors.toList());
	       
	       System.out.println(listSorted);
			
	}

}
