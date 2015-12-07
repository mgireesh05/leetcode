package com.mgireesh;

public class Solution {
	public int candy(int[] ratings) {
		int[] kids = new int[ratings.length];

		kids[0] = 1;
		for (int i = 1; i < ratings.length; i++) {
			kids[i] = 1;
			if (ratings[i] > ratings[i - 1]) {
				kids[i] = kids[i - 1] + 1;
			}
		}

		int candies = kids[ratings.length - 1];
		for (int i = ratings.length - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1]) {
				if (kids[i] <= kids[i + 1]) {
					kids[i] = kids[i + 1] + 1;
				}
			}
			candies += kids[i];
		}

		return candies;
	}
}