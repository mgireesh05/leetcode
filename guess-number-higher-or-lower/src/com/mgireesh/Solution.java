package com.mgireesh;
/* The guess API is defined in the parent class GuessGame.
@param num, your guess
@return -1 if my number is lower, 1 if my number is higher, otherwise return 0
   int guess(int num); */

public class Solution extends GuessGame {

	public int guessNumber(int n) {
		return guessNum(1, n);
	}

	public int guessNum(int start, int end) {
		int mid = 0;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (0 == guess(mid)) {
				break;
			} else if (-1 == guess(mid)) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return mid;
	}
}