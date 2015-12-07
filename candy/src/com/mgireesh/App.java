package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		// int[] ratings = { 3, 3, 2, 2, 4, 5, 5 };

		// int[] ratings = { 1, 2, 2 };

		int[] ratings = { 5, 3, 1 };
		// [1 1 1]
		// [ 3 2 1]

		System.out.println(sol.candy(ratings));
	}

}
