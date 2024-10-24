package com.dsa.seraching;
//s = start, e = end
public class BInarySearch_69 {

	public static void main(String[] args) {

	}

	public int mySqrt(int x) {
		if (x == 1)
			return 1;
		int s = 0;
		int e = x / 2;
		int ans = 0;
		while (s <= e) {
			long mid = s + (e - s) / 2;
			if (mid * mid <= x) {
				ans = (int) mid;
				s = (int) mid + 1;
			} else {
				e = (int) mid - 1;
			}
		}
		return ans;
	}
}
