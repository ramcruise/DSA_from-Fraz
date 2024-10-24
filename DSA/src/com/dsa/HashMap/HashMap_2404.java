package com.dsa.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_2404 {

	public static void main(String[] args) {
		int[] arr = {0,1,2,2,4,4,1};
		int val = mostFrequentEven(arr);
		System.out.println(val);
	}
	
	public static int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> freq =  new HashMap<>();
        for(int num :nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        
        int maxFreqSoFar = 0, finalAns = -1;
        for(Integer num : freq.keySet()) {
        	int curFreq = freq.get(num);
        	
        	if(num%2 ==1 || curFreq <maxFreqSoFar) {
        		continue;
        	}
        	if(curFreq > maxFreqSoFar || num < finalAns) {
        		maxFreqSoFar = curFreq;
        		finalAns = num;
        	}
        }
		return finalAns;
        
    }

}
