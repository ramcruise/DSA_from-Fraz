package com.java.two_pointer;
//125. Valid Palindrome
public class Valid_Palindrom {

	public static void main(String[] args) {
		boolean validade = isPalindrom("A man, a plan, a canal: Panama");
		System.out.println("is given number is palindrom :" +validade);
	}
	
	public static boolean isPalindrom(String s) {
		String fixed_string = "";
		
		for(char c : s.toCharArray()) {
			if(Character.isDigit(c) || Character.isLetter(c)) {
				fixed_string +=c;
			}
		}
		
		fixed_string = fixed_string.toLowerCase();
		
		int a_pointer = 0;
		int b_pointer = fixed_string.length()-1;
		
		while(a_pointer <=b_pointer) {
			if(fixed_string.charAt(a_pointer) != fixed_string.charAt(b_pointer)) {
				return false;
			}
			a_pointer +=1;
			b_pointer -=1;
		}
		return true;
	}
}
