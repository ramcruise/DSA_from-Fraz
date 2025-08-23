package com.dsa.maths;

public class Prime_number {

	public static void main(String[] args) {
		int num = 23;
		boolean isPrimeNum = findIsPrimeNum_3(num);
		System.out.println("Given num is prime num : "+isPrimeNum);
	}
	
	//3rd approach, most efficient approach
private static boolean findIsPrimeNum_3(int num) {
	if(num==1)
		return false;
	if(num==2 || num==3)
		return true;
	for(int i=5;i*i<=num;i=i+6) {
		if(num%i==0 || num%(i+2)==0)
			return false;
	}
	return true;
	}
//naive approach : 1
	private static boolean findIsPrimeNum(int num) {
		boolean flag = true;
		int count =0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count>2)
			flag=false;
		return flag;
	}
	//naive approach : 2
	private static boolean findIsPrimeNum_1(int num) {
		boolean flag = true;
		if(num==1) {
			return false;
		}
		for(int i = 2 ; i<num ; i++) {
			if(num%i==0)
				flag=false;
		}
		return flag;
	}

}
