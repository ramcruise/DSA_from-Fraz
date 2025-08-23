package com.java.two_pointer;

//392. Is Subsequence
public class Is_Subsequence {

	public static void main(String[] args) {
		String s = "abc";
		String t = "ahbgdc";
		boolean check = isSubsequence(s,t);
		System.out.println("Is Given string substring : " +check);
	}

	public static boolean isSubsequence(String s, String t) {
			if(s.length()==0)
				return true;
			int s_pointer =0;
			int t_pointer = 0 ;
			
			while(t_pointer <t.length()) {
				if(t.charAt(t_pointer)==s.charAt(s_pointer)) {
					s_pointer++;
					
					if(s_pointer == s.length())
						return true;
				}
				
				t_pointer++;
			}
		return false;
	}

}
