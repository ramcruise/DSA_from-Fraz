package com.java.ArrayString;

//58. Length of Last Word
public class LastWordCount {

	public static void main(String[] args) {
		String str = "   fly me   to   the moon  ";
		 int countOfWord= lengthOfLastWord(str);
		 System.out.println("count of last word : "+countOfWord);
	}

	public static int lengthOfLastWord(String s) {
		String str = s.trim();
		int count = 0;
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i) !=' ') {
				count++;
			}else {
				break;
			}
		}
		return count;
	}
}
