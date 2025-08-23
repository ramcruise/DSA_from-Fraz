package com.java.backtracking;

import java.util.LinkedList;
import java.util.List;

//leetcode : 17. Letter Combinations of a Phone Number
public class LetterCombination {

	public static void main(String[] args) {
		 List<String> permutationAns = letterCombinations("2398976568");
		 permutationAns.stream().forEach(i->System.out.println(i));
	}
	public static List<String> letterCombinations(String digits){
		LinkedList<String> output_arr = new LinkedList<String>();
		if(digits.length()==0)
			return output_arr;
		output_arr.add("");
		String[] char_map = new String[] {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		
		for(int i=0;i<digits.length();i++) {
			int index = Character.getNumericValue(digits.charAt(i));
			while(output_arr.peek().length()==i) {
				String permutaion = output_arr.remove();
				for(char c : char_map[index].toCharArray()) {
					output_arr.add(permutaion + c);
				}
			}
		}
		return output_arr;
		
		
	}

}
