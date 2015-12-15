package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.climbStairsRecursive(1));
		System.out.println(sol.climbStairsRecursive(3));
		System.out.println(sol.climbStairsRecursive(4));
		System.out.println(sol.climbStairsRecursive(5));
		System.out.println(sol.climbStairsRecursive(10));
		System.out.println(sol.climbStairsRecursive(44));

		System.out.println();

		System.out.println(sol.climbStairs(1));
		System.out.println(sol.climbStairs(3));
		System.out.println(sol.climbStairs(4));
		System.out.println(sol.climbStairs(5));
		System.out.println(sol.climbStairs(10));
		System.out.println(sol.climbStairs(44));

	}

}
