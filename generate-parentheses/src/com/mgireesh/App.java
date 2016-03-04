package com.mgireesh;

import java.util.List;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		List<String> list = sol.generateParenthesis(5);
		for (String s : list) {
			System.out.println(s);
		}

	}

}
