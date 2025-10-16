package com.java.String;

public class CountLastWord {

	public static void main(String[] args) {
		String s = "Hellof World";
		int count = lengthOfLastWord(s);
		System.out.println("num of count in word : "+count );
	}

	public static int lengthOfLastWord(String s) {
		/*String strArray = s.trim();
		int count =0;
		for(int i=strArray.length()-1;i>=0; i--) {
			if(strArray.charAt(i)!=' ') {
				count++;
			}else {
				break;
			}
		}*/
		int count =0;
		String[] strArr  = s.split(" ");
		String str1 = strArr[strArr.length-2];
		for(int i=0;i<str1.length();i++) {
			count++;
		}
		return count;
	}
	

}
