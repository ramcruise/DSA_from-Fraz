package com.dsa.greedy_algo;

//2nd video from GFG, greedy topic
public class Activity_solu_problem {

	public static void main(String[] args) {
    int s[] = {1,3,0,5,8,5};
    int f[] = {2,4,6,7,9,9};
    int n = s.length;
    printMaxActivity(s,f,n);
	}

	private static void printMaxActivity(int[] s, int[] f, int n) {
		int i,j;
		System.out.println("Following activities are selected : \n");
		//The activity always gets selected
		i=0;
		System.out.println(i+" ");
		//Consider the rest of  the activities
		for(j = 1; j < n; j++) {
			if(s[j] >= f[i]) {
				System.out.println(j+" ");
				i = j;
			}
		}
	}

}
