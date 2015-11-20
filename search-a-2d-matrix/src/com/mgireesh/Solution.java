package com.mgireesh;

public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		boolean found = false;
		int start = 0;
		int mid, i, j;
		int end = matrix.length * matrix[0].length - 1;
		while (start <= end) {
			mid = (start + end) / 2;
			i = mid / matrix[0].length;
			j = mid % matrix[0].length;

			if (target == matrix[i][j]) {
				found = true;
				break;
			}

			if (target < matrix[i][j]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return found;
	}
}
