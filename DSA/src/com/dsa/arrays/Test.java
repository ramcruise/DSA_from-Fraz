package com.dsa.arrays;

import java.util.HashMap;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		 String str1 = "racecar";
		 String str2 = "carrace" ;
		  boolean val = isAnagram(str1,str2);
		  System.out.println("Is Given str annagram : "+val);
	}

	private static boolean isAnagram(String str1, String str2) {
		boolean flag = false;
		int len1 = str1.length();
		int len2 = str2.length();
		if(len1 !=len2) {			
			return false;
		}
		HashMap<Character,Integer> hash1 = new HashMap<Character,Integer>();
		HashMap<Character,Integer> hash2 = new HashMap<Character,Integer>();
		for(Character ch1 : str1.toCharArray()) {
			hash1.put(ch1,hash1.containsKey(ch1) ? hash1.get(ch1)+1:1 );
		}		
		for(Character ch1 : str2.toCharArray()) {
			hash2.put(ch1,hash2.containsKey(ch1) ? hash2.get(ch1)+1:1 );
		}
			    		 
	      for(Entry<Character,Integer> entry1: hash1.entrySet()) {
	    	  for(Entry<Character,Integer> entry2: hash2.entrySet()) {
		    	  if(entry1.getKey()==entry2.getKey()) {
		    		  if(entry1.getValue()==entry2.getValue()) {
		    			  flag = true;
		    		  }else {
		    			  return flag;
		    		  }
		    	  }
	 	    	 
		      }
	    	 
	      }
	     
		return flag;
	}
	

}
