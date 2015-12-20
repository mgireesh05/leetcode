package com.mgireesh;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public boolean isValidSudoku(char[][] board) {
		// for (int i = 0; i < board.length; i++) {
		// for (int j = 0; j < board[i].length; j++) {
		// System.out.printf("%c ", board[i][j]);
		// }
		// System.out.println();
		// }

		// Verify rows and columns
		for (int i = 0; i < board.length; i++) {
			Set<Character> rowSet = new HashSet<Character>();
			Set<Character> colSet = new HashSet<Character>();
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != '.') {
					if (rowSet.contains(board[i][j])) {
						return false;
					}
					rowSet.add(board[i][j]);
				}
				if (board[j][i] != '.') {
					if (colSet.contains(board[j][i])) {
						return false;
					}
					colSet.add(board[j][i]);
				}
			}
		}

		// Verify blocks
		for (int i = 0; i < 9; i += 3) {
			for (int j = 0; j < 9; j += 3) {
				Set<Character> blockSet = new HashSet<Character>();
				for (int k = i; k < i + 3; k++) {
					for (int l = j; l < j + 3; l++) {
						if (board[k][l] != '.') {
							if (blockSet.contains(board[k][l])) {
								return false;
							}
							blockSet.add(board[k][l]);
						}
					}
				}
			}
		}

		return true;
	}
}
