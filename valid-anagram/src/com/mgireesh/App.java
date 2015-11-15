package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		// String s = "anagram";
		// String t = "nagaram";

		// String s = "rat";
		// String t = "car";

		String s = "ab";
		String t = "a";

		System.out.println(sol.isAnagram(s, t));
	}

}
