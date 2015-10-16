package com.mgireesh;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Solution sol = new Solution();
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		
		testArray.add(0);
		testArray.add(9);
		testArray.add(99);
		testArray.add(12345);
		testArray.add(65536);
		testArray.add(-1);
		
		for (Integer i = 0; i < testArray.size(); i++) {
			try {
				Integer ans = sol.addDigits(testArray.get(i));
				System.out.println(ans);
			} catch (IllegalArgumentException e) {
				System.out.println("Exception: Illegal argument");
			}
		}
	}
}
