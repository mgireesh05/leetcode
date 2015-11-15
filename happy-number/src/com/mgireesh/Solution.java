package com.mgireesh;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public boolean checkHappy(int n, Set<Integer> set) {
		Integer temp = n;
		if (set.contains(temp)) {
			return false;
		}
		int sum = 0;
		String str = Integer.toString(temp);
		for (int i = 0; i < str.length(); i++) {
			String digit = "" + str.charAt(i);
			sum += Math.pow(Integer.valueOf(digit), 2);
		}
		System.out.println(sum);
		if (sum == 1) {
			return true;
		}

		return checkHappy(sum, set);
	}

	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(4);
		set.add(16);
		set.add(37);
		set.add(58);
		set.add(89);
		set.add(145);
		set.add(42);
		set.add(20);

		return checkHappy(n, set);
	}
}
