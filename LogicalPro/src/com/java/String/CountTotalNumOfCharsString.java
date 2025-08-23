package com.java.String;

public class CountTotalNumOfCharsString {

	public static void main(String[] args) {
		String str = "We are learning java language";
		int count = 0;
		int vCount = 0;
		int cCount = 0;
		
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) !=' ') {
				count++;
			}
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
					str.charAt(i) == 'u') {
				vCount++;
			}else if(str.charAt(i) >'a' && str.charAt(i)<'z'){
				cCount++;
			}
		}
		System.out.println("total count of chars :"+count);
		System.out.println("total count of vowels in chars :"+vCount);
		System.out.println("total count of cosonent in chars :"+cCount);
		
		System.out.println("============using java 8 , Stream API");
		//using java 8
		long vowelCount = str.chars().filter(x -> x =='a' || x =='e' || x =='i' || x =='o' || x =='u'
		).count();
		System.out.println("count of vowel: "+vowelCount);
		
		System.out.println("================");
		//count consonent using javva 8
		long consonentCount = str.chars().filter(x -> x !='a' && x !='e' && x !='i' && x !='o' && x !='u'
				&& x !=' ').count();
				System.out.println("count of consonent: "+consonentCount);
		
		//total count
				System.out.println("=============total count");
		long totalCount = str.chars().filter(x -> x >='a'  && x <='z'
				&& x !=' ').count();
				System.out.println("count of totalCount: "+totalCount);
	}

}
