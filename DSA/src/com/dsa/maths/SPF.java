package com.dsa.maths;
//find smalletst prime factor
public class SPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int[] spf = primeSieve(n);
		for(int i=2; i<=n; i++) {
			System.out.println(i + " : "+spf[i]);
		}
	}

	private static int[] primeSieve(int n) {
		int[] spf = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(spf[i]>0)
				continue;
			spf[i] = i;
			if((long)i*i >(long)n)
				continue;
			for(int j =i*i; j<=n ; j +=i)
				if(spf[j] == 0)
					spf[j]=i;
		}
		
		return spf;
	}

}
