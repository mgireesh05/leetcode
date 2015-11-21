package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		// int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34,
		// 50 }, { 53, 54, 55, 60 } };
		int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		System.out.println(sol.searchMatrix(matrix, 5));
		System.out.println(sol.searchMatrix(matrix, 20));
	}

}
