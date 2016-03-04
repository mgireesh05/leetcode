package com.mgireesh;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.reverseBits(43261596));
		System.out.println(String.format("%32s",
				Integer.toBinaryString(43261596)).replace(' ', '0'));
		System.out.println(String.format("%32s",
				Integer.toBinaryString(sol.reverseBits(43261596))).replace(' ',
				'0'));
	}
}
