package com.dsa.stack;

public class CountOfParanthesis {

	public static void main(String[] args) {
		String s = "(()))";
		boolean ans = isBalanced(s);
		System.out.println("Paranthesis is balanced : " + ans);
	}

	private static boolean isBalanced(String s) {
		int openning_paranthesis = 0;
		int closing_paranthesis = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ')') {
				closing_paranthesis++;
			} else {
				openning_paranthesis++;
			}

			if (closing_paranthesis > openning_paranthesis)
				return false;
		}

		if (openning_paranthesis == closing_paranthesis)
			return true;
		else
			return false;
	}

}
