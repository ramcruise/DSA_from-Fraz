package com.dsa.recursion;

public class Natural_number_sum_using_recursion {

	public static void main(String[] args) {
	int n = 4;
    	
    	System.out.println(getSum(n));
     
	}

	static int getSum(int n)
	{  
		if(n == 0)
			return 0;

		return n + getSum(n - 1);

	}
}
