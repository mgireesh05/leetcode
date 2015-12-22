package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		// String s = " the sky is blue ";
		// String s = " ";
		String s = "  the  sky      is blue      ";
		System.out.println(s);
		System.out.println(sol.reverseWords(s));
	}

}
