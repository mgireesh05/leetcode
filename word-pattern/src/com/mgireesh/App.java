package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.wordPattern("abba", "abba"));
		System.out.println(sol.wordPattern("abba", "dog cat cat dog"));
		System.out.println(sol.wordPattern("abba", "dog cat cat fish"));
		System.out.println(sol.wordPattern("abba", "dog dog dog dog"));
		System.out.println(sol.wordPattern("", "beef"));
	}

}
