package com.dsa.maths;
//We are given two numbers. The task is to compute Power(x,n)  which means x to the power y.

public class Computing_Power {
	public static void main(String[] args) {
		int num = 3;
		int power = 2;
		int value = power(num,power);
		System.out.println("power of the given num : "+value);
	}
	
	//efficient solution T.C. = O(logn)
	static int power(int num, int power)
	{
		if(power == 0)
			return 1;
		
		int temp = power(num, power/2);
		temp = temp * temp;

		if(power % 2 == 0)
			return temp;
		else
			return temp * num; 
	}
	
//naive solution T.C. = O(n)
	private static int powerOfGivenNum(int num,int power) {
		int res= 1;
		for(int i=1;i<=power;i++) {
			res = res*num;
		}
		
		return res;
	}

}
