package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.reverseVowels("leetcode"));
		System.out.println(sol.reverseVowels("ai"));
		System.out.println(sol.reverseVowels("Marge let's \"went.\" I await news telegram."));
		System.out.println(sol.reverseVowels("Marge  let's \"went.\" I await news telegram."));
		System.out.println(sol.reverseVowels(" apG0i4maAs::sA0m4i0Gp0"));

	}

}
