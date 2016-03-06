package com.mgireesh;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		System.out.println(sol.compareVersion("1.6", "1.5"));
		System.out.println(sol.compareVersion("13.37", "13.37"));
		System.out.println(sol.compareVersion("0.3", "0.5"));
		System.out.println(sol.compareVersion("0.31", "0.5"));
		System.out.println(sol.compareVersion("1", "2"));
		System.out.println(sol.compareVersion("1", "0.9"));
		System.out.println(sol.compareVersion("1.0", "1"));
	}

}
