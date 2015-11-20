package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 }, { 53, 54, 55, 60 } };
		// int[][] matrix = { { 1, 3, 5 } };
		// int[][] matrix = { { 1, 1 } };
		// int[][] matrix = { { 1 }, { 3 } };
		System.out.println(sol.searchMatrix(matrix, 34));
	}

}
